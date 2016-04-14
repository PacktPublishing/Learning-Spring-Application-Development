package org.packt.Spring.chapter3.Annotation.onsetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private EmployeeDao employeeDao;
	
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

}
