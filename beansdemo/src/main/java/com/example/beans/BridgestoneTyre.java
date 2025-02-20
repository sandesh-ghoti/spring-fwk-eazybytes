package com.example.beans;

import org.springframework.stereotype.Component;

import com.example.interfaces.Tyre;

@Component(value = "bridgestoneTyre")
public class BridgestoneTyre implements Tyre {
  public void rollTyre() {
    System.out.println("rolling tyre of BridgestoneTyre");
  }
}
