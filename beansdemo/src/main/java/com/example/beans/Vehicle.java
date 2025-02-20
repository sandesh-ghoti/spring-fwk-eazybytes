package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.example.services.VehicleService;

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
}
