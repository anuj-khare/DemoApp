package com.example1.demo;

import com.example1.demo.AliceAndHerBakery.CakeBaker;
import com.example1.demo.Service.NotificationService;
import com.example1.demo.Service.PaymentService;
import lombok.Value;
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
    CakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        cakeBaker.bakeCake();
    }
}
