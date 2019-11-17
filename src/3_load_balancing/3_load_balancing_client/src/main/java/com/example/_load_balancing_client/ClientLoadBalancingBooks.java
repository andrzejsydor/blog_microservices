package com.example._load_balancing_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableDiscoveryClient	
@SpringBootApplication
public class ClientLoadBalancingBooks {

	public static void main(String[] args) {
		SpringApplication.run(ClientLoadBalancingBooks.class, args);
	}
}
