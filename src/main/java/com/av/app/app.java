package com.av.app;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// read about @SpringBootApplication in deep
@SpringBootApplication
public class app {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(app.class, args);
		
		//myObj object is containing the bean class
		Dev myObj = context.getBean(Dev.class);
		// Created a custom object which user has to handle
		// Dev dev = new Dev();
		// dev.build();

		//myObj has now the bean class access to call the build method
		myObj.build();
	}
}