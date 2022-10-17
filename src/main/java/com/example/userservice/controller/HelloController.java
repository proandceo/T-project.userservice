package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/hello")
    public void getHello(){
        System.out.println("===========" + instanceId + " ============");

    }
}
