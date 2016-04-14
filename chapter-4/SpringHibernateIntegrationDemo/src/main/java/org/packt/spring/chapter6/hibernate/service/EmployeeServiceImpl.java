package org.packt.spring.chapter6.hibernate.service;

import java.util.List;

import org.packt.spring.chapter6.hibernate.dao.EmployeeDao;
import org.packt.spring.chapter6.hibernate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> emList = employeeDao.getAllEmployees();
		return emList;
	}

	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}
}
