package com.example.beans;

import org.springframework.stereotype.Component;

import com.example.interfaces.Tyre;

@Component(value = "michelinTyre")
public class MichilenTyre implements Tyre {

  public void rollTyre() {
    System.out.println("rolling tyre of Michilen");
  }
}
