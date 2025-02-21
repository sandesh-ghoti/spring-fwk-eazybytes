package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.configuration.config;
import com.example.services.VehicleService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(config.class);
        Person person = context.getBean(Person.class);
        VehicleService vehicleService = person.getVehicle().getVehicleService();
        boolean isVehicleStarted = true;
        vehicleService.music(isVehicleStarted);
        vehicleService.roll(isVehicleStarted);
        context.close();
    }
}