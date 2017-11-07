package com.louie.learning.springcloud;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/11/7.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne() {
        return "sorry，error";
    }
}
