package org.packt.Spring.chapter7.springmvc.service;

import java.util.List;

import org.packt.Spring.chapter7.springmvc.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employeee);

	public List<Employee> listEmployee();

	public void removeEmployee(Integer employeeId);

}
