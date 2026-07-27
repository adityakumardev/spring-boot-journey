package com.av.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// read about @SpringBootApplication in deep
@SpringBootApplication
public class app {

	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
		
		// Created a custom object which user has to handle
		Dev dev = new Dev();
		dev.build();
	}

}
