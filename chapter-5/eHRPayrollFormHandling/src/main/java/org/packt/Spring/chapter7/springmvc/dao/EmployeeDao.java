package org.packt.Spring.chapter7.springmvc.dao;

import java.util.List;

import org.packt.Spring.chapter7.springmvc.model.Employee;

public interface EmployeeDao {

	public List<Employee> listEmployee();

	public void insertEmployee(Employee employee);

	public void deleteEmployee(Integer employeeId);

}
