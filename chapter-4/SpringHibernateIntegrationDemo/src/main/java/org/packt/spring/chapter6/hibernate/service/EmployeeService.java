package org.packt.spring.chapter6.hibernate.service;

import java.util.List;
import org.packt.spring.chapter6.hibernate.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public void insertEmployee(Employee employee);
}
