package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Speaker;
import com.example.beans.Tyre;

@ComponentScan("com.example.beans")
@Configuration
public class config {
  @Bean
  public Tyre tyre() {
    Tyre tyre = new Tyre("michilen");
    return tyre;
  }

  @Bean
  public Speaker speaker() {
    Speaker speaker = new Speaker("Bose");
    return speaker;
  }
}
