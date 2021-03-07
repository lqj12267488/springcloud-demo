package com.wintop.springcloudgateway.filter;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.wintop.springcloudgateway.entity.Result;
import com.wintop.springcloudgateway.utils.IpUtil;
import org.apache.commons.lang.StringUtils;

public class IpFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        Object isSuccess = currentContext.get("isSuccess");
        //如果GatewayFilter 返回false 即此过滤器不生效
        return isSuccess == null ? true: Boolean.parseBoolean(isSuccess.toString());
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        String ipAddr = IpUtil.getIpAddr(currentContext.getRequest());
        if (StringUtils.isNotBlank(ipAddr) && "192.168.107.2".equals(ipAddr)){
            //黑名单 不予访问
            //不需要路由到服务
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseBody(String.valueOf(JSONObject.toJSON(Result.error(401,"ip禁止访问"))));
            currentContext.getResponse().setContentType("application/json;charset=utf-8");
            return null;
        }
        return null;
    }
}
