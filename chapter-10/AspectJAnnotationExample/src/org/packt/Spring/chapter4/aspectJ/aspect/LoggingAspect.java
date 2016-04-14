package org.packt.Spring.chapter4.aspectJ.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("loggingAspect")
public class LoggingAspect {

	@Pointcut("execution(* org.packt.Spring.chapter4.aspectJ.service.*.*(..))")
	public void serviceMethod() {
	} // signature

	@Around("serviceMethod()")
	public Object aroundLoginAdvice(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {
		System.out.println("Additional Concern Before calling actual method");
		// Here is a code that get executed before target method
		Object result = proceedingJoinPoint.proceed();

		// Here is a code that get executed after taget method
		System.out.println("Additional Concern After calling actual method");
		return result;
	}

	@Before("serviceMethod()")
	public void beforeLoginAdvice() {
		System.out.println("Before advice run");
	}

	@After("serviceMethod()")
	public void afterLoginAdvice() {
		System.out.println("After advice run");
	}

	@AfterReturning("serviceMethod()")
	public void afterReturningLoginAdvice() {
		System.out.println("After returning advice run");
	}

	@AfterThrowing("serviceMethod()")
	public void afterThrowingLoginAdvice() {
		System.out.println("After throwing advice run");
	}
}
