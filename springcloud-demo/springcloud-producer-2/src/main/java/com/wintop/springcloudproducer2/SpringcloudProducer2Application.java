package com.wintop.springcloudproducer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudProducer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProducer2Application.class, args);
    }

}
