package com.credibanco.cards;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CredibanCoCardsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CredibanCoCardsServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner init() {
		return args -> System.out.println("CredibanCo Cards Service started successfully");
	}
}

