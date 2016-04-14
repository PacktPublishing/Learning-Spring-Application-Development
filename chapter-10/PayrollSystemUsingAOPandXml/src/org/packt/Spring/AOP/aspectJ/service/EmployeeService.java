package org.packt.Spring.AOP.aspectJ.service;

import org.packt.Spring.AOP.aspectJ.model.Employee;

public class EmployeeService {

	private Employee employee;

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

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
