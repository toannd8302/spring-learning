package com.toannguyen;

import com.config.ProjectConfig;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Componet Vehicle Name from Spring Context: " + vehicle.getName());
        vehicle.printHello();
    }
}