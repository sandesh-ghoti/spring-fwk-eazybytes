package com.example.beans;

import org.springframework.stereotype.Component;

import com.example.interfaces.Speaker;

@Component(value = "boseSpeaker")
public class BoseSpeaker implements Speaker {

  public String playMusic() {
    return "playing music in " + "Bose";
  }
}
