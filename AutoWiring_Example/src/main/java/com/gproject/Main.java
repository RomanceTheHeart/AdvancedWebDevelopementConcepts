package com.gproject;


import com.example.bean.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

/*
Because I've used @Component annotation to create the spring bean all other beans associated with the Vehicle class
gets referenced as the same. While using the @Component annotation only one instance of the class can be added to the Spring
Context.
Other differences of using the @Component annotation verses the @Bean annotation is that you can create an object instance
 for any application easily. Therefore, utilizing less code.
 The Cons of using @Component annotation is that the developer has less control in creating the bean.
While using this method the developer loses a certain amount of control but there are other methods
emplace that gives some control back to the developer: such as the PostConstruct and PreDestroy annotation.


 */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);

        System.out.println("The name associated with Spring context is : " + person.getName());
        System.out.println("The Vehicle name associated with person : " + person.getVehicle());
        context.close();

    }
}