package com.example._calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RouteCalc {

	public static void main(String[] args) {
		SpringApplication.run(RouteCalc.class, args);
	}

}

@RestController
class CalcController{
	
	@GetMapping
	String books() {
		return "Calc";
	}
}