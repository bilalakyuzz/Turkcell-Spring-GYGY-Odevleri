package com.turkcell.spring.turkcell.odev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestControllerAdvice
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
