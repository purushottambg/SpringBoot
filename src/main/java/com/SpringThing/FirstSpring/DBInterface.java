package com.SpringThing.FirstSpring;

public interface DBInterface {
    default String getData(){
        return "Interface";
    }
}
