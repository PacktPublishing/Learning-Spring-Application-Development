package org.packt.Spring.AOP.aspectJ.main;

import org.packt.Spring.AOP.aspectJ.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		EmployeeService employeeService = (EmployeeService) context
				.getBean("employeeService");
		System.out.println("Employee Name: "
				+ employeeService.getEmployee().getEmpName());
		try {
			employeeService.printThrowException();
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
