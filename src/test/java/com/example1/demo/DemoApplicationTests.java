package com.example1.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

@SpringBootTest
class DemoApplicationTests {

    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        String notificationType = System.getenv("Notification_Type");
        if (notificationType != null && !notificationType.isEmpty()) {
            registry.add("notification.type", () -> notificationType);
        } else {
            //setting default notification type as sms
            registry.add("notification.type", () -> "sms");
        }
    }

    @Test
    void contextLoads() {
    }

}
