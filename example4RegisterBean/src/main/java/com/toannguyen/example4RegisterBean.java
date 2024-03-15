package com.toannguyen;

import com.config.ProjectConfig;
import com.example.beans.Vehicle;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.function.Supplier;

public class example4RegisterBean {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkwagen = new Vehicle();
        volkwagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkwagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;

        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);
        if (randomNumber % 2 == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        } else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }
        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try {
            volksVehicle = context.getBean("volkswagen",Vehicle.class);
        }catch (NoSuchBeanDefinitionException e) {
            e.printStackTrace();
        }
        try{
            audiVehicle = context.getBean("audi", Vehicle.class);
        }catch(NoSuchBeanDefinitionException e){
            e.printStackTrace();
        }
        if (null != volksVehicle){
            System.out.println("Programing Vehicle from Spring Context is " + volksVehicle.getName());

        }else{
            System.out.println("Programing Vehicle from Spring Context is: " + audiVehicle.getName());
        }

    }
}