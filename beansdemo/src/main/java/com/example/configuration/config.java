package com.example.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = { "com.example.beans", "com.example.services" })
@Configuration
public class config {

}
