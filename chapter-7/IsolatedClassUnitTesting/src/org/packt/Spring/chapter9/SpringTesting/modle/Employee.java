package org.packt.Spring.chapter9.SpringTesting.modle;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(String employeeId, String firstName, String lastName,
			int salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee employee = (Employee) obj;
		return employee.employeeId.equals(employeeId);
	}
}
