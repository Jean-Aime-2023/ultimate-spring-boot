package com.sizer.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/post")
    public String post(@RequestBody String message){
        return "Request accepted and message is : " + message;
    }
    @PostMapping("/post-order")
    public String postOrder(@RequestBody Order order){
        return "Request accepted and message is : " + order.toString();
    }
    @PostMapping("/post-order-record")
    public String postRecord(@RequestBody OrderRecord order){
        return "Request accepted and message is : " + order.toString();
    }
}
