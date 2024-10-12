package com.SpringThing.FirstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    final private  DBInterface dbInterface;
    public DBService(DBInterface dbInterface){
        this.dbInterface=dbInterface;
    }



}
