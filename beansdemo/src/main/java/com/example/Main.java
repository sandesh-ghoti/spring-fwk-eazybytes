package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.Vehicle;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName() + " " + vehicle.getMake()); // audi 2020
        context.close();
    }
}