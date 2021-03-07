package com.wintop.springcloudgateway.filter;

import com.alibaba.fastjson.JSONObject;
import com.wintop.springcloudgateway.entity.Result;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class CloudFallbackProvider implements ZuulFallbackProvider {
    @Override
    public String getRoute() {
        //为所有的服务提供服务回退 即Hystrix服务降级处理
        return "*";
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        return new ClientHttpResponse() {
            @Override
            public HttpHeaders getHeaders() {
                return null;
            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream((JSONObject.toJSON(Result.error(500,"服务器内部异常"))).toString().getBytes());
            }

            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 0;
            }

            @Override
            public String getStatusText() throws IOException {
                return null;
            }

            @Override
            public void close() {

            }
        };
    }
}
