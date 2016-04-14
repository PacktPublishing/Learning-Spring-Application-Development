package org.packt.Spring.chapter3.requiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");

		System.out.println(employeeDao.getDatabaseUrl());

	}

}
