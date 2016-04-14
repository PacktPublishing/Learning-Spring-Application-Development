package org.packt.Spring.chapter8.springsecurity.service;

import java.util.List;

import org.packt.Spring.chapter8.springsecurity.model.Employee;

public interface EmployeeService {

	public List<Employee> listEmployee();

	public void insertEmployee(Employee employee);

	public void deleteEmployee(Integer employeeId);

}
