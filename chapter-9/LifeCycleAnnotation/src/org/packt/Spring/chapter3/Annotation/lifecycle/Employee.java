package org.packt.Spring.chapter3.Annotation.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	@PostConstruct
	public void initializeEmployee() {
		System.out.println("Init Of Employee");
	}

	@PreDestroy
	public void destroyEmployee() {
		System.out.println("Destroy Of Employee");
	}
}
