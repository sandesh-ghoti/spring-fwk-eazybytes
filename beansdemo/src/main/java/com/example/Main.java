package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.Vehicle;
import com.example.configuration.config;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(config.class);
        // to create context using xml file of class path need to use
        // `ClassPathXmlApplicationContext`
        Vehicle vehicle = context.getBean(Vehicle.class);
        String stringBean = context.getBean(String.class);
        int intBean = context.getBean(int.class);
        System.out.println(vehicle.getName());
        System.out.println(stringBean);
        System.out.println(intBean);
        context.close();
    }
}