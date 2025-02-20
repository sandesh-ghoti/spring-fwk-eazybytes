package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.beans.Vehicle;

@Configuration
public class config {
  @Bean("audi")
  public Vehicle vehicle() {
    var vehicle = new Vehicle();
    vehicle.setMake(2019);
    vehicle.setName("Audi 8");
    return vehicle;
  }

  @Primary
  @Bean("honda")
  public Vehicle vehicle1() {
    var vehicle = new Vehicle();
    vehicle.setMake(2019);
    vehicle.setName("Honda WR");
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
