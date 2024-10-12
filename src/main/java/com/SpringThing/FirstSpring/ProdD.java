package com.SpringThing.FirstSpring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="environment.type", havingValue = "prod")
public class ProdD implements DBInterface{
    @Override
    public String getData() {
        return "This is Prod Data";
    }
}
