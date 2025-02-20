package com.example;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.Vehicle;
import com.example.configuration.config;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(config.class);

        Vehicle vehicle = new Vehicle();
        Supplier<Vehicle> vehicleSupplier = () -> vehicle;
        vehicle.setName("audiii-1");
        context.registerBean("vehicle", Vehicle.class, vehicleSupplier);
        Vehicle vehicle2 = context.getBean(Vehicle.class);

        vehicle2.setMake(2020);
        System.out.println(vehicle2.getName() + " " + vehicle2.getMake()); // audiii-1 2020
        context.close();
    }
}