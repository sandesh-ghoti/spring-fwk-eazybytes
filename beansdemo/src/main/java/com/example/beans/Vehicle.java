package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.services.VehicleService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Vehicle {
  private String name = "Honda";
  private int make;
  private final VehicleService vehicleService;

  @Autowired
  public Vehicle(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMake() {
    return make;
  }

  public void setMake(int make) {
    this.make = make;
  }

  public VehicleService getVehicleService() {
    return vehicleService;
  }

  @PostConstruct
  public void init() {
    System.out.println(getClass().getName() + "init method called");
  }

  @PreDestroy
  public void destroy() {
    System.out.println(getClass().getName() + "destroy method called");
  }
}
