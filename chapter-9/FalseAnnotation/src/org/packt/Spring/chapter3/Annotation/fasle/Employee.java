package org.packt.Spring.chapter3.Annotation.fasle;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Override
	public String toString() {
		return "From employee class";
	}

}
