package org.packt.Spring.chapter5.JDBC.dao;

import java.sql.SQLException;

import org.packt.Spring.chapter5.JDBC.model.Employee;

public interface EmployeeDao {

	// get employee data based on employee id
	Employee getEmployeeById(int id);

	// create employee table
	void createEmployee();

	// insert values to employee table
	void insertEmployee(Employee employee);

}
