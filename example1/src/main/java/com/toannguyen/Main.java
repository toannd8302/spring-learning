package com.toannguyen;

import com.config.ProjectConfig;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle Name from non-spring context: " + vehicle.getName());

//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle veh  = context.getBean(Vehicle.class); => lỗi nếu còn nhiều instance cùng thuộc Vehicle class
//        System.out.println("Vehicle Name from Spring Context: " + veh.getName());
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh  = context.getBean("vehicle3",Vehicle.class); //Define ra tên của instance
        System.out.println("Vehicle Name from Spring Context: " + veh.getName());
        String hello = context.getBean(String.class); // lấy ra Bean
        System.out.println("String value from Spring Context: " + hello);
        Integer number = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context: " + number);
    }
}