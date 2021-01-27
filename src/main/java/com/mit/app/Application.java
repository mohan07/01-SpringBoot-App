package com.mit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private Map<String,Object> cache = new HashMap<String,Object>();
	private static final String REST_URL = "Some URL";


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		int a=10;
	}
	

	public void loadDataToCache(){

		//logic
	}
	//HIS 2001 related changes
	public void doProcess() {
	
		//logic goes here 
	}

}
