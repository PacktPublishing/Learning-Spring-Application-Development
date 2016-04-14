package org.packt.Spring.chapter3.Annotation.onconstruction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private Employee employee;

	@Autowired
	EmployeeService(Employee employee) {
		System.out.println("Inside Employee Service Constructor");
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

}
