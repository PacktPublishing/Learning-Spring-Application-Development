package org.packt.Spring.chapter5.JDBC.dao;

import org.packt.Spring.chapter5.JDBC.model.Employee;

public interface EmployeeDao {

	void createEmployee();

	int getEmployeeCount();

	int insertEmployee(Employee employee);

	int deleteEmployeeById(int empId);

	Employee getEmployeeById(int empId);

}
