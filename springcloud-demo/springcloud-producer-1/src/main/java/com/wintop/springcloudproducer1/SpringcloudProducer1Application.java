package com.wintop.springcloudproducer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudProducer1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProducer1Application.class, args);
    }

}
