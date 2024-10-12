package com.SpringThing.FirstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication implements CommandLineRunner {

	@Autowired
	Apple apple;
	@Autowired
	Guava guava1, guava2;
	@Autowired
	BeanScope beanScope1, beanScope2;
	@Autowired
	ProdD prodD;
	@Autowired
	DevDb devDb;


	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(apple.getApple());
//		System.out.println(apple.eatApple());
//		System.out.println(guava1.GuavaEat());
//		guava1.preGuava(); //will be auto called pre-destruct
//		guava2.postGuava(); // Will be auto called post-construct
//		System.out.println("HashCode for Guava1 bean"+ guava1.hashCode());
//		System.out.println("HashCode for Guava2 bean"+ guava2.hashCode()); //Hashcode is Unique for each object
//		System.out.println("HashCode for BeanScope bean"+ beanScope1.hashCode());
//		System.out.println("HashCode for BeanScope bean"+ beanScope2.hashCode()); //Hashcode is Unique for each object
		System.out.println(devDb.getData());
		System.out.println(prodD.getData());
	}
}
