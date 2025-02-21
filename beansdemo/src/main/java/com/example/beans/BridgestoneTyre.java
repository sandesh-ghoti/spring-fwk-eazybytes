package com.example.beans;

import org.springframework.stereotype.Component;

import com.example.interfaces.Tyre;

@Component(value = "bridgestoneTyre")
public class BridgestoneTyre implements Tyre {
  public String rollTyre() {
    return "rolling tyre of BridgestoneTyre";
  }
}
