package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("Vehicle_2") Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public String getName(){
        return name;
    }
    public void setNam(String name){
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
