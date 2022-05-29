package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloRestController {
    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello from Bridgelabz!";
    }

}
