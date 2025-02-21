package com.example.beans;

import org.springframework.stereotype.Component;

import com.example.interfaces.Tyre;

@Component(value = "michelinTyre")
public class MichilenTyre implements Tyre {

  public String rollTyre() {
    return "rolling tyre of Michilen";
  }
}
