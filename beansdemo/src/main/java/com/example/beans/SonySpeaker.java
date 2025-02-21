package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.interfaces.Speaker;

@Primary
@Component(value = "sonySpeaker")
public class SonySpeaker implements Speaker {
  public String playMusic() {
    return "playing music in " + "Sony";
  }
}
