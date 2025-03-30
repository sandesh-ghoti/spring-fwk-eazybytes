package com.example.beans;

import org.springframework.stereotype.Component;

import com.example.interfaces.Tyre;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component(value = "michelinTyre")
public class MichilenTyre implements Tyre {

  public String rollTyre() {
    return "rolling tyre of Michilen";
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
