package com.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle(); //var la tu khoa khai bao trong Java 10
        veh.setName("Audi 8");
        return veh;
    }
    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle(); //var la tu khoa khai bao trong Java 10
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle(); //var la tu khoa khai bao trong Java 10
        veh.setName("Ferrari");
        return veh;
    }
    @Bean
    String hello(){
        return "Hello World";
    }
    @Bean
    Integer number(){
        return 16;
    }
}
