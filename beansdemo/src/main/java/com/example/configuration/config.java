package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = { "com.example.beans", "com.example.services", "com.example.aspects" })
@Configuration
@EnableAspectJAutoProxy
public class config {
  @Bean
  public static CustomBeanPostProcessor customBeanPostProcessor() {
    return new CustomBeanPostProcessor();
  }

  @Bean
  public static CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor() {
    return new CustomBeanFactoryPostProcessor();
  }
}
