package com.louie.learning.springcloud;

import com.netflix.discovery.converters.Auto;
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

    public String service(){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi",String.class);
    }
}
