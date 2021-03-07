package com.wintop.springcloudgateway.config;

import com.wintop.springcloudgateway.filter.IpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IpFilterConfig {

    @Bean
    public IpFilter IpFilter(){
        return new IpFilter();
    }
}
