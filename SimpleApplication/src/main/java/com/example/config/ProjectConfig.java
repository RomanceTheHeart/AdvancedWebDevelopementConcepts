package com.example.config;

import com.example.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So the Spring container can process the class and generate Spring Beans.

 */
@Configuration
public class ProjectConfig {

    /*
    @Bean annotation, which let's Spring know that it needs to call
    this method when it initializes its context and adds the returned value to the context.
     */
    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.SetName("Lincoln Navigator");
        return veh;
    }


    @Bean
    Vehicle vehicle_2(){
       var veh = new Vehicle();
        veh.SetName("Corvette");
        return veh;
    }

    @Primary // returns this object as the default bean.
    @Bean() // can references a value in a database.
    Vehicle vehicle_3(){
        var veh = new Vehicle();
        veh.SetName("Audi");
        return veh;
    }


    /*
    The method names usually follows verb notation,but for methods
    thar we use to create beans, we can use nouns as names.
    This will be good practice as the method name will become beans as well as in the context;
     */

    @Bean
    String Hello()
    {
        return "Hello World!!";

    }
    @Bean
    Integer Number(){
        return 16;
    }
}
