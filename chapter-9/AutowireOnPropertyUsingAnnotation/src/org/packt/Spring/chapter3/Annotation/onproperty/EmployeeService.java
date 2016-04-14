package org.packt.Spring.chapter3.Annotation.onproperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

}
