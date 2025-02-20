package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;

@Component
public class VehicleService {
  private Speaker speaker;
  private Tyre tyre;

  @Autowired
  public VehicleService(Speaker speaker, @Qualifier("bridgestoneTyre") Tyre tyre) {
    this.speaker = speaker;
    this.tyre = tyre;
  }

  public void music() {
    speaker.playMusic();
  }

  public void roll() {
    tyre.rollTyre();
  }
}
