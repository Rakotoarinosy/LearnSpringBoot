package com.example.projetSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ProjetSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetSpringApplication.class, args);
	}

	@RestController
	class Democontrolleur{
		@GetMapping("/helloo")
		public String hello() {
			return "Hello word";
		}
	}

}
