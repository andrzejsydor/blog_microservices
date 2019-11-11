package com.example._load_balancing_books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class LoadBalancingBooks {

	@GetMapping
	String start() {
		return String.format("Hello from %s with Port Number %s!", 
				eurekaClient.getApplication(appName).getName(), serverPort);
	}

	@GetMapping(path = "/check")
	String hello() {
		return String.format("Hello from %s with Port Number %s!", 
				eurekaClient.getApplication(appName).getName(), serverPort);
	}
	
	@Autowired
	@Lazy
	EurekaClient eurekaClient;

	@Value("${spring.application.name}")
	String appName;

	@Value("${server.port}")
	String serverPort;
	
	public static void main(String[] args) {
		SpringApplication.run(LoadBalancingBooks.class, args);
	}
}
