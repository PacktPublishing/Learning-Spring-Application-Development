package org.packt.Spring.chapter3.Annotation.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@PostConstruct
	public void initializeEmployee() {
		System.out.println("Init Of EmployeeService");
	}

	@PreDestroy
	public void destroyEmployee() {
		System.out.println("Destroy Of EmployeeService");
	}
}
