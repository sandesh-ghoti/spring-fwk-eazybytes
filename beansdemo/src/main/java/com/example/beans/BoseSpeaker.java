package com.example.beans;

import org.springframework.stereotype.Component;

import com.example.interfaces.Speaker;

@Component(value = "boseSpeaker")
public class BoseSpeaker implements Speaker {

  public void playMusic() {
    System.out.println("playing music in " + "Bose");
  }
}
