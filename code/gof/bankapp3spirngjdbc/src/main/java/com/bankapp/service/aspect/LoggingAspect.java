package com.bankapp.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LoggingAspect {

	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Around("execution(* com.bankapp.service.*.*(..))")
	public Object perforamceMonitoring(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		Object returnValue = joinPoint.proceed();
		long end = System.nanoTime();
		logger.info("time taken to call the method: " + joinPoint.getSignature().getName() + " is : " + (end - start)
				+ " ns");
		return returnValue;
	}
}
