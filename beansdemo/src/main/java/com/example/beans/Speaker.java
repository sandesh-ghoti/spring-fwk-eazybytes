package com.example.beans;

public class Speaker {
  private String name;

  public Speaker(String name) {
    this.name = name;
  }

  public void playMusic() {
    System.out.println("playing music in " + name);
  }
}
