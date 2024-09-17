package com.SpringThing.FirstSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MiniBeans {
    @Bean
    @Primary
    EatApple Banana(){
        return  new EatApple();
    }
}
