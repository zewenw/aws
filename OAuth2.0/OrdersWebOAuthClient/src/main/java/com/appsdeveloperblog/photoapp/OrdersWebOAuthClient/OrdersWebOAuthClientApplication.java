package com.appsdeveloperblog.photoapp.OrdersWebOAuthClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrdersWebOAuthClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdersWebOAuthClientApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
