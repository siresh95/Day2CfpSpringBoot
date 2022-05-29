package com.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication
@Controller
public class helloWebController {
    @GetMapping("/web")
    public String hello(){
        return "hello";
    }
    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","This ia a custom message.Hello from bridgelabz");
        return "message";
    }

}
