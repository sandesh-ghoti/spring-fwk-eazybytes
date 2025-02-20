package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
  private String name;
  private int make;

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
}
