package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;
  private final Vehicle vehicle; // we can achieve final bean creation using contructor beans injection

  @Autowired
  public Person(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

}
