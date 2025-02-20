package com.example.beans;

public class Tyre {
  private String name;

  public Tyre(String name) {
    this.name = name;
  }

  public void rollTyre() {
    System.out.println("rolling tyre of " + name);
  }
}
