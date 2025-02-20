package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Vehicle;
import com.example.beans.VehicleService;
import com.example.configuration.config;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(config.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        VehicleService vehicleService = vehicle.getVehicleService();
        vehicleService.music();
        vehicleService.roll();
        context.close();
    }
}