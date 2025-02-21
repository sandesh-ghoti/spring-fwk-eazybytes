package com.example.aspects;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
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
}
