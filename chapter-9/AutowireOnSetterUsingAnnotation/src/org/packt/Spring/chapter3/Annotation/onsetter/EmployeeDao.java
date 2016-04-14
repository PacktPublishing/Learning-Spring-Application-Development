package org.packt.Spring.chapter3.Annotation.onsetter;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Override
	public String toString() {
		return "Data Access logic will reside in DAO";
	}

}
