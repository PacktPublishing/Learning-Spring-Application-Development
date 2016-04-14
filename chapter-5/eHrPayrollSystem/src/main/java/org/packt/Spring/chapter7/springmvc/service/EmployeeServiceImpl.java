package org.packt.Spring.chapter7.springmvc.service;

import java.util.List;

import org.packt.Spring.chapter7.springmvc.dao.EmployeeDao;
import org.packt.Spring.chapter7.springmvc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;

	public void addEmployee(Employee employeee) {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> listEmployee() {
		return this.employeeDao.listEmployee();
	}

	public void removeEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		
	}
}
