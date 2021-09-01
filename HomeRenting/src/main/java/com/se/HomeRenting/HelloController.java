package com.se.HomeRenting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "name")
@RestController
public class HelloController {

    @Value("{$name}")
    private String name;

    @Value("{$address}")
    private String address;

    @RequestMapping("/hello")
    public String hello(){
        String sentence = name + " has made a great first step in " + address;
        return sentence;
    }
}
