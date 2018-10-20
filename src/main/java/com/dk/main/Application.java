package com.dk.main;


import com.dk.beans.MyMessage;
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

    @Autowired
    MyMessage myMessage;

    @RequestMapping("/say")
    public String sayHello(){

        return message;
    }

    @RequestMapping("/lucky")
    public String luckyNumber(){

        return "Your lucky number :"+myMessage.getMessageValue();
    }

    public static void main(String... args){

        SpringApplication.run(Application.class,args);
    }

}
