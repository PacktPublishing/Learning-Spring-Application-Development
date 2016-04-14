package org.packt.Spring.chapter5.JDBC.main;

import org.packt.Spring.chapter5.JDBC.dao.EmployeeDao;
import org.packt.Spring.chapter5.JDBC.dao.EmployeeDaoImpl;
import org.packt.Spring.chapter5.JDBC.model.Employee;

public class HrPayrollSystem {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		// create employee table
		employeeDao.createEmployee();
		// insert into employee table
		employeeDao.insertEmployee(new Employee(1, "Ravi"));
		// get employee based on id
		Employee employee = employeeDao.getEmployeeById(1);
		System.out.println("Employee name: " + employee.getName());
	}
}
