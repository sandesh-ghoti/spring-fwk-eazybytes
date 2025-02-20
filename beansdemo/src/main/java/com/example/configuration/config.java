package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.beans.Vehicle;

@ComponentScan("com.example.beans")
@Configuration
public class config {
  @Bean
  public Vehicle vehicle1() {
    Vehicle vehicle = new Vehicle();
    vehicle.setMake(2020);
    vehicle.setName("audi");
    return vehicle;
  }

  @Bean
  public Vehicle vehicle2() {
    Vehicle vehicle = new Vehicle();
    vehicle.setMake(2021);
    vehicle.setName("Skoda");
    return vehicle;
  }

  @Bean
  public Vehicle vehicle3() {
    Vehicle vehicle = new Vehicle();
    vehicle.setMake(2022);
    vehicle.setName("M&M");
    return vehicle;
  }

  @Bean
  public String helloWroldString() {
    return "Hello World";
  }

  @Bean
  public int intBean() {
    return 10;
  }
}
