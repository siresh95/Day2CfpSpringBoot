package com.bridgelabz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloWebController {
    @GetMapping("/web")
    public String hello(){
        return "hello";
    }

}
