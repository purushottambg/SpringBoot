package com.SpringThing.FirstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBProvider {
    final private DBs dBs;
    @Autowired
    private DBs db;

    public DBProvider(DBs dBs){
        this.dBs = dBs;
    }
    String getData(){
        return  db.getData();
    }
}
