package com.example1.demo;

import com.example1.demo.Service.NotificationService;
import com.example1.demo.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    PaymentService paymentService;

    @Autowired
//    @Qualifier("sms")
    NotificationService notificationService;

    //If you want to see all the instances of a bean type
    //But make sure to remove ConditionalOnProperty from Notification Implementation Beans
    //Otherwise Springboot will not initiate those beans
//    @Autowired
//    Map<String,NotificationService> notificationServiceMap = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        paymentService.pay();
        notificationService.send("Notification is being sent");
        //You can iterate over all the instances of notification services
//        for(Map.Entry<String,NotificationService> notificationServiceItem : notificationServiceMap.entrySet()){
//            System.out.println(notificationServiceItem.getValue());
//        }
    }
}
