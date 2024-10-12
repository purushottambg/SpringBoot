package com.SpringThing.FirstSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Apple {
    @Bean
    public String getApple(){
        return "This is MiniBean";
    }
    @Bean
    public String eatApple(){
        return "Eating Apple from Mini Bean"; //wil return this value and assign to calling things
    }
}
