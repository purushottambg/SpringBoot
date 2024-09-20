package com.SpringThing.FirstSpring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="dcd.env", havingValue = "production")
public class ProdDB implements DBs{
    public String getData() {
        return "This is Production Data";
    }
}
