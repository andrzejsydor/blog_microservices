package com.example._zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulServer {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServer.class, args);
	}
}
