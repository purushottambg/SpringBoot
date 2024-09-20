package com.SpringThing.FirstSpring;

import org.springframework.stereotype.Component;

@Component //This is the component declaration so can be used as a Bean
public class ProdDB {

    public void getData() {
        System.out.println("This is Production Data");
    }
}
