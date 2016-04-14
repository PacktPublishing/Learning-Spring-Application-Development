package org.packt.springframework.chapter3.includefilter;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class EmployeeService {

	public String toString() {
		return "Implements business logic in Service class";
	}

}
