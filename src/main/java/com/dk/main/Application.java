package com.dk.main;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "com.dk.beans")
public class Application {

    @Value("${name}")
    String var;

    @Autowired
    String message;

    @RequestMapping("/say")
    public String sayHello(){

        return message;
    }

    public static void main(String... args){

        SpringApplication.run(Application.class,args);
    }

}
