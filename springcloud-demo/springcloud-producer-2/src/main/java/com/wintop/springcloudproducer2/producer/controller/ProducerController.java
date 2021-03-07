package com.wintop.springcloudproducer2.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("producer")
public class ProducerController {

    @RequestMapping(value = "getServerPort",method = RequestMethod.GET)
    public Integer getServerPort(HttpServletRequest request){
        return request.getServerPort();
    }
}
