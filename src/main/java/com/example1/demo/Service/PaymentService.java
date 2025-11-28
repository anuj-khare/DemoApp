package com.example1.demo.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class PaymentService {
    @PostConstruct
    public void afterConstruction(){
        System.out.println("Payment Bean Initialized");
    }
    public void pay(){
        System.out.println("Paying");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Payment Bean about to be destroyed");
    }
}
