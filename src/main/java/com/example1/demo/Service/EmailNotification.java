package com.example1.demo.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
@ConditionalOnProperty(value = "notification.type",havingValue = "email")
public class EmailNotification implements NotificationService{
    @Override
    public void send(String msg) {
        System.out.println("Email Notification Service is sending the msg "+msg);
    }
}
