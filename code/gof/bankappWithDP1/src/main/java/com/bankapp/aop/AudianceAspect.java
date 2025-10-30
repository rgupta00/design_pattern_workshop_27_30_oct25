package com.bankapp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//AOP: Aspect=advice + pointcut

@Component
@Aspect
public class AudianceAspect {

//	@Pointcut("execution(public void clapping())")
//	public void foo() {}
	
	//@AfterReturning vs @After
//	@AfterThrowing(pointcut = "execution(public void doMagic())", throwing = "ex")
//	public void clapping(Exception ex) {
//		System.out.println(ex.getMessage());
//		//System.out.println("maza aa gaya");
//	}
	
	@Around("execution( * com.bankapp.aop.*.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("method is just going to be called: "+joinPoint.getSignature().getName());
		Object returnValue=joinPoint.proceed();
		System.out.println("method call is finished");
		return returnValue;
	}
	
}
