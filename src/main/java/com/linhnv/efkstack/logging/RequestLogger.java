package com.linhnv.efkstack.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RequestLogger {

    @Before("execution(public * com.linhnv.efkstack.controller..*.*(..))")
    public Object logRequest(JoinPoint joinPoint) {


        return null;
    }
}
