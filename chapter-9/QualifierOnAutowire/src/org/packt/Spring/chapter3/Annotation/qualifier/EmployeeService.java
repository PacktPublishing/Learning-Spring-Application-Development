package org.packt.Spring.chapter3.Annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	@Qualifier("employeeA")
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}
}
