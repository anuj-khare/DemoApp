package com.example1.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "notification.type=sms")
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
