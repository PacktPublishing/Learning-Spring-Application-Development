package org.packt.Spring.chapter4.aspectJ.model;

public class Employee {

	private String empName;

	public String getEmpName() {
		System.out.println("Employee Name: " + empName);
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
