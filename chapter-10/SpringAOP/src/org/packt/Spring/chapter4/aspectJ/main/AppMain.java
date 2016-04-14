package org.packt.Spring.chapter4.aspectJ.main;

import org.packt.Spring.chapter4.aspectJ.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		EmployeeService employeeService = context.getBean("employeeService",
				EmployeeService.class);

		System.out.println(employeeService.getEmployee().getEmpName());
	}

}
