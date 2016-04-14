package org.packt.springframework.chapter3.SpEL.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		EmployeeService employeeService = (EmployeeService) context
				.getBean("employeeService");

		System.out.println(employeeService.getListElement());
		System.out.println(employeeService.getMapElement());

	}

}
