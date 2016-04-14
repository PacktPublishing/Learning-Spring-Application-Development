package org.packt.springframework.chapter3.excludefilter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) context.getBean("employeeDAO");
		System.out.println("Employee Dao: " + employeeDao);

		EmployeeService employeeService = (EmployeeService) context
				.getBean("employeeService");
		System.out.println("Employee Service: " + employeeService);

	}
}
