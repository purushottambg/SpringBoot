package com.SpringThing.FirstSpring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Guava {
    @PreDestroy
    void preGuava(){
        System.out.println("This will print before Destruction of Guava Bean");
    }
    @PostConstruct
    void postGuava(){
        System.out.println("This will print after creation of Guava Bean");
    }

    String GuavaEat(){
        return "Guava is an stereotype Bean";
    }
}
