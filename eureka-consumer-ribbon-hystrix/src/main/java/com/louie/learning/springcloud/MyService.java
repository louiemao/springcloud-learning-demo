package com.louie.learning.springcloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/11/7.
 */
@Service
public class MyService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String service(){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi",String.class);
    }

    public String hiError() {
        return "sorry,error!";
    }
}
