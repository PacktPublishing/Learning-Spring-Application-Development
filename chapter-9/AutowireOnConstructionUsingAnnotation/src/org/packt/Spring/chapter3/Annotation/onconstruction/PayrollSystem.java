package org.packt.Spring.chapter3.Annotation.onconstruction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService employeeService = (EmployeeService)context.getBean("employeeService");		
		System.out.println(employeeService.getEmployee());
	}

}
