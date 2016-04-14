package org.packt.Spring.chapter4.aspectJ.service;

import org.packt.Spring.chapter4.aspectJ.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private Employee employee;

	public Employee getEmployee() {
		//int i = 1/0;
		System.out.println("Ravi");
		return employee;
	}

}
