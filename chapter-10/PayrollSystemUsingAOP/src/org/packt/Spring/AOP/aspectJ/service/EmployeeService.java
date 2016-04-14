package org.packt.Spring.AOP.aspectJ.service;

import org.packt.Spring.AOP.aspectJ.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private Employee employee;

	public Employee getEmployee() {
		System.out.println("EmployeeService: employee returned");
		return employee;
	}

	public void printThrowException() {
		System.out.println("EmployeeService: Exception occured");
		throw new IllegalArgumentException(
				"Throwing illegal argument exception from Service class");
	}
}
