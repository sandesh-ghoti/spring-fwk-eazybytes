package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.Vehicle;
import com.example.configuration.config;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(config.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        String stringBean = context.getBean(String.class);
        int intBean = context.getBean(int.class);

        vehicle.setMake(10);
        vehicle.setName("Honda");

        System.out.println(vehicle.getName());
        System.out.println(stringBean);
        System.out.println(intBean);
        context.close();
    }
}