package org.packt.Spring.chapter3.annotaionvsxml;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Override
	public String toString() {
		return "Annotation Based Configuration";
	}

}
