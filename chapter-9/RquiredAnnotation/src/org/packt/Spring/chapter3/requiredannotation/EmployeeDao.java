package org.packt.Spring.chapter3.requiredannotation;

import org.springframework.beans.factory.annotation.Required;

public class EmployeeDao {

	String databaseUrl;

	@Required
	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}

	public String getDatabaseUrl() {
		return databaseUrl;
	}
	
	
}
