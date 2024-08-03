package com.sizer.example;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;

    public MyFirstService(MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    public String tellStory(){
        return "the dependency is saying : " + myFirstClass.sayHello();
    }
}
