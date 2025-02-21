package com.example.services;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;

@Component
public class VehicleService {
  private Speaker speaker;
  private Tyre tyre;
  private Logger logger = Logger.getLogger(VehicleService.class.getName());

  @Autowired
  public VehicleService(Speaker speaker, @Qualifier("bridgestoneTyre") Tyre tyre) {
    this.speaker = speaker;
    this.tyre = tyre;
  }

  public void music() {
    Instant start = Instant.now();
    logger.info("method execution start");
    speaker.playMusic();
    logger.info("method execution end");
    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();
    logger.info("Time took to execute the method : " + timeElapsed);
  }

  public void roll() {
    Instant start = Instant.now();
    logger.info("method execution start");
    tyre.rollTyre();
    logger.info("method execution end");
    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();
    logger.info("Time took to execute the method : " + timeElapsed);
  }
}
