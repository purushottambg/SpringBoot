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
	Guava guava;
	@Autowired
	BeanScope beanScope1, beanScope2;


	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(apple.getApple());
		System.out.println(apple.eatApple());
		System.out.println(guava.GuavaEat());
		guava.preGuava();
		guava.postGuava();
		System.out.println("HashCode for BeanScope bean"+ beanScope1.hashCode());
		System.out.println("HashCode for BeanScope bean"+ beanScope2.hashCode());
	}
}
