package org.packt.springframework.chapter3.includefilter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		EmployeeDao employeeDao = (EmployeeDaoImp) context
				.getBean("employeeDaoImp");
		System.out.println("Employee Dao: " + employeeDao);

		EmployeeService employeeService = (EmployeeServiceImp) context
				.getBean("employeeServiceImp");
		System.out.println("Employee Service: " + employeeService);
	}

}
