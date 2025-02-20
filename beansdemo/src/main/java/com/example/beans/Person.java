package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;
  private final Vehicle vehicle; // we can achieve final bean creation using contructor beans injection

  @Autowired
  public Person(@Qualifier("vehicle2") Vehicle vehicle2) {
    this.vehicle = vehicle2;
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
