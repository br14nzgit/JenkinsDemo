package com.rev_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RevAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevAppApplication.class, args);
	}

	@GetMapping("/guest")
	public String guest(){
		return"Hello Guest";
	}

	@GetMapping("/welcome")
	public String welcome(){
		return"Hello Guest";
	}
}
