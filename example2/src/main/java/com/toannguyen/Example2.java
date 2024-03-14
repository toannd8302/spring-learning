package com.toannguyen;

import com.config.ProjectConfig;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle Name from non-spring context: " + vehicle.getName());

//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle veh  = context.getBean(Vehicle.class); => lỗi nếu còn nhiều instance cùng thuộc Vehicle class
//        System.out.println("Vehicle Name from Spring Context: " + veh.getName());
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1  = context.getBean("Audi",Vehicle.class); //Define ra tên của instance
        System.out.println("Vehicle Name from Spring Context: " + veh1.getName());

        Vehicle veh2  = context.getBean("Honda",Vehicle.class); //Define ra tên của instance
        System.out.println("Vehicle Name from Spring Context: " + veh2.getName());

        Vehicle veh3  = context.getBean("Ferrari",Vehicle.class); //Define ra tên của instance
        System.out.println("Vehicle Name from Spring Context: " + veh3.getName());

        String hello = context.getBean(String.class); // lấy ra Bean
        System.out.println("String value from Spring Context: " + hello);
        Integer number = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context: " + number);
    }
}