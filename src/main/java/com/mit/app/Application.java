package com.mit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	private static final String REST_URL = "Some URL";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		int a=10;
	}
	
	//HIS 2001 related changes
	public void doProcess() {
	
		//logic goes here 
	}

}
