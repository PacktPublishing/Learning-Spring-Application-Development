package org.packt.Spring.AOP.aspectJ.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	/**
	 * Pointcut.
	 */
	public void serviceMethod() {
	}

	/**
	 * Execute before a selected method execution.
	 */
	public void beforeAdvice() {
		System.out.println("Before Advice: Going to setup Employee.");
	}

	/**
	 * Execute after a selected method execution.
	 */
	public void afterAdvice() {
		System.out.println("Employee has been setup.");
	}

	/**
	 * Execute when any method returns.
	 */
	public void afterReturningAdvice() {
		System.out.println("After returning advice run");
	}

	/**
	 * Execute if there is an exception raised by any method.
	 */
	public void afterThrowingAdvice() {
		System.out.println("There has been an exception: ");
	}

	/**
	 * Execute around advice.
	 */
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {
		System.out.println("Additional Concern Before calling actual method");
		// Here is a code that get executed before target method
		Object result = proceedingJoinPoint.proceed();

		// Here is a code that get executed after taget method
		System.out.println("Additional Concern After calling actual method");
		return result;
	}
}
