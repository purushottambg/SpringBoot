package com.SpringThing.FirstSpring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="dcd.env", havingValue = "development")
public class DevDB implements DBs {
    public String getData(){
        return "This is Development Data";
    }
}
