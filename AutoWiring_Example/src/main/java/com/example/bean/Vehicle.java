package com.example.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Vehicle {
    private String name;

    public String getName(){return name;}

    public void SetName(String name){this.name =name;}

    @PostConstruct
    public void initialize(){
        this.name = "Lamborghini";
    }

    @PreDestroy
    public void  destroy(){
        System.out.println("Destroying " + this.getName());
    }
    public void PrintVehicleRegistry() {
        System.out.println("Vehicle Registry Number: " + this.name + " " + 2022);

    }
    @Override
    public String toString ()
    {
        return "Operator vehicle: " + name;
    }


}
