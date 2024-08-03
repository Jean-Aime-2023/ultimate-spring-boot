package com.sizer.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean
	public MyFirstClass myFirstBean(){
		return new MyFirstClass("Aime");
	}
    @Bean
	public MyFirstClass mySecondBean(){
		return new MyFirstClass("Emelyne");
	}
    @Bean
    @Primary
	public MyFirstClass myThirdBean(){
		return new MyFirstClass("Emable");
	}
}
