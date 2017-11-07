package com.louie.learning.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/7.
 */
@RestController
public class MyController {
    @Autowired
    MyService myService;

    @GetMapping("/hi")
    public String hi() {
        return myService.service();
    }
}
