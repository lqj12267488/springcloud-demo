package com.wintop.springcloudgateway.config;

import com.wintop.springcloudgateway.filter.GatewayFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayFilterConfig {
    @Bean
    public GatewayFilter GatewayFilter(){
        return new GatewayFilter();
    }
}
