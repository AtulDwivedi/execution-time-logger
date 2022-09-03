package com.atuldwivedi.etl.logger.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author Atul Dwivedi
 */
@Aspect
@Component
@Slf4j
@ConditionalOnProperty(name = "app.execution-time-logger", havingValue = "true")
public class ExecutionTimeAdvice {

    @Around("@annotation(com.atuldwivedi.etl.logger.annotation.TrackExecutionTime)")
    public Object executionTime(ProceedingJoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object object = point.proceed();
        long endtime = System.currentTimeMillis();
        log.info(point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName() + ": Time taken for Execution is : " + (endtime - startTime) + "ms");
        return object;
    }

}
