package com.usuario.usuario.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    private static final Logger logger = LoggerFactory.getLogger(ExecutionTimeAspect.class);

    @Around("execution(* com.usuario.usuario.service..*(..))") // Intercepta todos los métodos en el paquete service
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();

        Object result = joinPoint.proceed(); // Continuar con el metodo original

        long endTime = System.nanoTime();
        long durationInMillis = (endTime - startTime) / 1_000_000;

        logger.info("Método {} ejecutado en {} ms", joinPoint.getSignature(), durationInMillis);

        return result;
    }
}
