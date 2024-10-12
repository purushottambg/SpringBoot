package com.SpringThing.FirstSpring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //Can be multiple objects created
public class BeanScope {
    BeanScope(){} //Default constructor
    public void BeanScope(int val){
        System.out.println("Parameterized constructor of BeanScope with value "+val);
    }
    @PreDestroy
    public void preDestruction(){
        System.out.println("Printing before the destruction starts");
    }
    @PostConstruct
    public void postDestruction(){
        System.out.println("Printing after the creation of BeanScope starts");
    }
}
