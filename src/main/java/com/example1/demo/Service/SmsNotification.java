package com.example1.demo.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
@ConditionalOnProperty(value = "notification.type",havingValue = "sms")
public class SmsNotification implements NotificationService{
    @Override
    public void send(String msg) {
        System.out.println("Sms Notification service is sending the msg " + msg);
    }
}
