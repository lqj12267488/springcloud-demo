package com.wintop.springcloudconsumer.consumer.service;


import com.wintop.springcloudconsumer.consumer.service.impl.ConsumerServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(name = "cloud-producer",fallback = ConsumerServiceImpl.class)
public interface ConsumerService {

    @RequestMapping(value = "/producer/producer/getServerPort",method = RequestMethod.GET)
    Integer getServerPort();
}
