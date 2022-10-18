package com.gproject;


import com.example.bean.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

    public static void main(String[] args) {

       /* Vehicle vehicle = new Vehicle();
        vehicle.SetName("Mercedes");
        System.out.println("The Vehicle name from non-spring context is': " + vehicle.getName());
*/
        /*
        The var keyword was introduced in Java 10. Type interface is used in
        var keyword. It automatically detects the datatype of a variable
        based on its context.
         */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle_3", Vehicle.class); // get bean with more than one new (unique) object.
        System.out.println("The Vehicle name associated with Spring context is : " + veh.getName());


        /*
        Wes don't need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you request.
        If a Bean doesn't exist. Spring will throw an exception.
         */


    }
}