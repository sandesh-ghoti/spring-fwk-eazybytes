package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.configuration.config;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(config.class);
        Vehicle vehicle = context.getBean("vehicle2", Vehicle.class);

        Person person = context.getBean(Person.class);
        person.setName("sandeep");
        System.out.println(vehicle.getName() + " " + vehicle.getMake()); // audi 2020
        System.out.println(person.getName() + " vehicle: " + person.getVehicle().getName());
        context.close();
    }
}