package com.hireath.eureka.producer.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String indexa(@RequestParam String name) {
    	System.out.println(name);
        return "hello啊"+name+"，this is first messge";
    }
}