package org.packt.Spring.chapter9.SpringTesting.dao;

import org.packt.Spring.chapter9.SpringTesting.modle.Employee;

public interface EmployeeDao {
	
	public void createEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(String employeeId);

	public Employee findEmployee(String employeeId);
	
	public boolean isOldEmployee(String employeeId);
	
}
