package com.toannguyen;

import com.config.ProjectConfig;
import com.example.beans.Vehicle;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.function.Supplier;

public class example5BeanXmlConfig {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle Name in Spring Context is: " + vehicle.getName());
    }
}