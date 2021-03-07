package com.wintop.springcloudgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.wintop.springcloudgateway.entity.Result;
import org.apache.commons.lang.StringUtils;
import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletRequest;

public class GatewayFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        //数值越小 优先级越高
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        //时候启用该过滤器
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //处理过滤逻辑
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getHeader("token");
        if (StringUtils.isBlank(token) && !"123456".equals(token)){
            //无权限
            //不需要路由到后端服务
            context.setSendZuulResponse(false);
            //真正不转发请求
            //context.set("sendForwardFilter.ran",true);
            context.setResponseBody(String.valueOf(JSONObject.toJSON(Result.error(403,"token无效"))));
            context.getResponse().setContentType("application/json;charset=utf-8");
            //告诉之后的过滤器 不再向下执行
            context.set("isSuccess",false);
            return null;
        }else{
            context.set("isSuccess",true);
        }
        return null;
    }
}
