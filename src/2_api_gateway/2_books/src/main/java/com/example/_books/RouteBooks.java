package com.example._books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RouteBooks {

	public static void main(String[] args) {
		SpringApplication.run(RouteBooks.class, args);
	}

}

@RestController
class BooksController{
	
	@GetMapping
	String books() {
		return "Books";
	}
}