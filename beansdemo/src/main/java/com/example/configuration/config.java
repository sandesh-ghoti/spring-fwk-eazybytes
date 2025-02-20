package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.example.beans")
@Configuration
public class config {

  @Bean
  public String helloWroldString() {
    return "Hello World";
  }

  @Bean
  public int intBean() {
    return 10;
  }
}
