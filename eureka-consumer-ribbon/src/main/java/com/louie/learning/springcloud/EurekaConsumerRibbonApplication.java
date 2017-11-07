package com.louie.learning.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/11/7.
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
