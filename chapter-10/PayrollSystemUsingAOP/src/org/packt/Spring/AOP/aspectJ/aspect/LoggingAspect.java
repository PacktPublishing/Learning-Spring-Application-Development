package org.packt.Spring.AOP.aspectJ.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("loggingAspect")
public class LoggingAspect {

	@Pointcut("execution(* org.packt.Spring.AOP.aspectJ.service.EmployeeService.getEmployee(..))")
	public void serviceMethod() {
	}

	/**
	 * Execute before a selected method execution.
	 */
	@Before("serviceMethod()")
	public void beforeAdvice() {
		System.out.println("Before Advice: Going to setup Employee.");
	}

	/**
	 * Execute after a selected method execution.
	 */
	@After("serviceMethod()")
	public void afterAdvice() {
		System.out.println("Employee has been setup.");
	}

//	/**
//	 * Execute when any method returns.
//	 */
//	@AfterReturning("serviceMethod()")
//	public void afterReturningAdvice(Object retVal) {
//		System.out.println("Returning:" + retVal.toString());
//	}

	/**
	 * Execute if there is an exception raised by any method.
	 */
	@AfterThrowing("execution(* org.packt.Spring.AOP.aspectJ.service.EmployeeService.printThrowException())")
	public void afterThrowingLoginAdvice() {
		System.out.println("There has been an exception: ");
	}
}
