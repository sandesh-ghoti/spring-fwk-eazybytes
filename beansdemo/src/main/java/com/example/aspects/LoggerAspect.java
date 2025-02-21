package com.example.aspects;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggerAspect {
  Logger logger = Logger.getLogger(LoggerAspect.class.getName());

  @Around("execution(* com.example.services.*.*(..))")
  public void log(ProceedingJoinPoint joinPoint) throws Throwable {
    Instant start = Instant.now();
    logger.info(joinPoint.getSignature().toString() + " method execution start");
    joinPoint.proceed();
    logger.info(joinPoint.getSignature().toString() + "method execution end");
    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();
    logger.info(joinPoint.getSignature().toString() + "Time took to execute the method : " + timeElapsed);
  }

  @AfterThrowing(value = "execution(* com.example.services.*.*(..))", throwing = "ex")
  public void handleThrowing(JoinPoint joinPoint, Exception ex) {
    logger.log(Level.SEVERE, joinPoint.getSignature().toString() + " oops got the error " + ex.getMessage());
  }

  @AfterReturning(value = "execution(String com.example.services.*.*(..))", returning = "returnVal")
  public void handleReturning(JoinPoint joinPoint, String returnVal) {
    logger.info(joinPoint.getSignature().toString() + " got the following return value " + returnVal);
  }
}
