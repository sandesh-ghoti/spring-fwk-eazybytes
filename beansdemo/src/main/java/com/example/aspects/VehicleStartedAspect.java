package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class VehicleStartedAspect {
  @Before("execution(* com.example.services.*.*(..)) && args(isVehicleStarted,..)")
  public void checkVehicleStarted(JoinPoint joinPoint, boolean isVehicleStarted) {
    if (!isVehicleStarted) {
      throw new RuntimeException("Vehicle not started yet");
    }
  }
}
