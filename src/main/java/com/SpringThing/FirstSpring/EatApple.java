package com.SpringThing.FirstSpring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class EatApple {
    void  eatApple(){
        System.out.println("Eating apple");
    }
    @PostConstruct
    void gettingAppleReady(){
        System.out.println("Getting fresh apple for you, @PostConstruct annotation");
    }
    @PreDestroy
    void  postEatHabits(){
        System.out.println("Will put peels in bin, @PreDestroy annotation");
    }
}
