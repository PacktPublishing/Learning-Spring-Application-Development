package org.packt.Spring.chapter9.SpringTesting.service;

import org.packt.Spring.chapter9.SpringTesting.modle.Employee;

public interface EmployeeService {
	
	public boolean isOldEmployee(String employeeId);
	
	public void createEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(String employeeId);

	public Employee findEmployee(String employeeId);

}
