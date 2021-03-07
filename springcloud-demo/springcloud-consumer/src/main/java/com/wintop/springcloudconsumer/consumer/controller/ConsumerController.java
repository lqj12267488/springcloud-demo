package com.wintop.springcloudconsumer.consumer.controller;

import com.wintop.springcloudconsumer.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "getServerPort",method = RequestMethod.GET)
    public Integer getServerPort(){
        return consumerService.getServerPort();
    }
}
