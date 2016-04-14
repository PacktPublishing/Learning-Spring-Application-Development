package org.packt.Spring.chapter7.springmvc.service;

import java.util.List;

import org.packt.Spring.chapter7.springmvc.dao.EmployeeDao;
import org.packt.Spring.chapter7.springmvc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> listEmployee() {
		return this.employeeDao.listEmployee();
	}

	public void insertEmployee(Employee employee) {
		this.employeeDao.insertEmployee(employee);
	}

	public void deleteEmployee(Integer employeeId) {
		this.employeeDao.deleteEmployee(employeeId);
	}
}
