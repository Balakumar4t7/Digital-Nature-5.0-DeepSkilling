package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

    private static final Logger log = LoggerFactory.getLogger(LogginAspect.class);

    @Around("execution(* com.library..*(..))")
    public Object logExecutionTime(ProceedingJoinPoint jp){
        long start =System.currentTimeMillis();
        Object res = jp.getSignature().getName();
        long end =System.currentTimeMillis();
        log.info("{} executed in {} ", res,(end-start));
        return res;
    }
}
