package org.packt.Spring.chapter5.JDBC.model;

public class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {

		setId(id);
		setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
