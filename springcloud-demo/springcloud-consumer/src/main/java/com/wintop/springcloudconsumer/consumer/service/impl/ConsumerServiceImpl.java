package com.wintop.springcloudconsumer.consumer.service.impl;

import com.wintop.springcloudconsumer.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public Integer getServerPort() {
        System.out.println("服务器内部异常");
        return 500;
    }
}
