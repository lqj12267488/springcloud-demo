package com.wintop.springcloudproducer1.filter;

import com.wintop.springcloudproducer1.entity.Result;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@Configuration
public class CloudExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result defaultExceptionHandler(HttpServletRequest req,Exception e){
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException){
            return Result.error(404,"接口不存在");
        }else{
            return Result.error(500,"服务器内部异常");
        }
    }
}
