package com.SpringThing.FirstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class FirstSpringApplication {
	@Autowired
    ProdDB prodDB;

	@Autowired
	DevDB devDB;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
		prodDB.getData();
		devDB.getData();
	}

}
