package org.packt.Spring.chapter3.Annotation.fasle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private Employee employee;

	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired(required = false)
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee getEmployee() {
		return employee;
	}

}
