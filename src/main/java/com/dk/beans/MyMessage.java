package com.dk.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyMessage {

    @Value("${mymessage.value}")
    private String messageValue;

    public String getMessageValue() {
        return messageValue;
    }

    public void setMessageValue(String messageValue) {
        this.messageValue = messageValue;
    }
}
