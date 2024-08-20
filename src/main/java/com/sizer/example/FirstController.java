package com.sizer.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    
    @GetMapping
    public String sayHello(){
        return "Hello from my first controller";
    }
    @GetMapping("/hello-2")
    public String sayHello2(){
        return "Hello from my 2 controller";
    }
}
