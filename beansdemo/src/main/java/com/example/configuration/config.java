package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Person;
import com.example.beans.Vehicle;

@ComponentScan("com.example.beans")
@Configuration
public class config {
  @Bean
  public Vehicle vehicle() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("audi");
    vehicle.setMake(2020);
    return vehicle;
  }

  @Bean
  public Person person(Vehicle vehicle) {
    Person person = new Person();
    person.setName("sandeep");
    person.setVehicle(vehicle);
    return person;
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
