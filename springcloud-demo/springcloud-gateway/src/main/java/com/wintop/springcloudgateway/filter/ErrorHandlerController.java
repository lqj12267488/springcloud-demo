package com.wintop.springcloudgateway.filter;

import com.wintop.springcloudgateway.entity.Result;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ErrorHandlerController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("error")
    public Result error(HttpServletRequest req){
        return Result.error(500,"zuul过滤器内部异常");
    }
}
