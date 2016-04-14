package org.packt.Spring.chapter7.springmvc.service;

import java.util.List;

import org.packt.Spring.chapter7.springmvc.model.Employee;

public interface EmployeeService {

	public List<Employee> listEmployee();

	public void insertEmployee(Employee employee);

	public void deleteEmployee(Integer employeeId);

}
