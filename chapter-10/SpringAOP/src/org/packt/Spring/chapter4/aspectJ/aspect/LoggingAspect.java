package org.packt.Spring.chapter4.aspectJ.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getEmpName())")
	public void loginAdvice() {
		System.out.println("Advice run. Get Method called");
	}

}
