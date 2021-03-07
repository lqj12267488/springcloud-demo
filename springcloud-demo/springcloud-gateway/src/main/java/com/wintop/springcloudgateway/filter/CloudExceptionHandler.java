package com.wintop.springcloudgateway.filter;

import com.wintop.springcloudgateway.entity.Result;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Configuration
public class CloudExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public Result defaultExceptionHandler(Exception e){
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException){
            return Result.error(404,"接口不存在");
        }else{
            return Result.error(500,"服务器内部异常");
        }
    }
}
