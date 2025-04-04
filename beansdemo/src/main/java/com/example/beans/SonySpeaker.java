package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.interfaces.Speaker;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Primary
@Component(value = "sonySpeaker")
public class SonySpeaker implements Speaker {
  public String playMusic() {
    return "playing music in " + "Sony";
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
