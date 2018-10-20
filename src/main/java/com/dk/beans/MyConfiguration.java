package com.dk.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class MyConfiguration {


     String message= "Private message";
     @Bean
     public String message(){
        return message;
    }
}
