package com.kgisl.bookstoresb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;


@SpringBootApplication
@OpenAPIDefinition
public class BookstoresbApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoresbApplication.class, args);
	}

}
