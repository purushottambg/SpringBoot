package com.SpringThing.FirstSpring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Guava {
//    @PreDestroy
//    void preGuava(){ //Bean Hooks
//        System.out.println("This will print before Destruction of Guava Bean");
//    }
//    @PostConstruct
//    void postGuava(){  //Hooks
//        System.out.println("This will print after creation of Guava Bean");
//    }

    String GuavaEat(){
        return "Guava is an stereotype Bean";
    }
}
