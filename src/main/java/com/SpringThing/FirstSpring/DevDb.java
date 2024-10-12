package com.SpringThing.FirstSpring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "environment.type", havingValue = "dev")
public class DevDb implements DBInterface{
    @Override
    public String getData() {
        return "This is Dev Data";
    }
}
