package com.example.__project;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class Application {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to session";
	}
	@GetMapping("/message1")
	public String getMessage1() {
		return "Welcome to session";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
