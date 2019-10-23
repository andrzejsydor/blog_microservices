package com.example._discovery_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class DiscoveryEurekaClient {

	@Value("${server.port}")
	String port;

	@GetMapping
	String hello() {
		return String.format("hello: %s", port);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryEurekaClient.class, args);
	}
}
