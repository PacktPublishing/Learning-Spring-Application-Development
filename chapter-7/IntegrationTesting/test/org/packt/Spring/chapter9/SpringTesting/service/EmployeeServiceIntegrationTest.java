package org.packt.Spring.chapter9.SpringTesting.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.packt.Spring.chapter9.SpringTesting.dao.EmployeeDao;
import org.packt.Spring.chapter9.SpringTesting.dao.InMemeoryEmployeeDaoImpl;
import org.packt.Spring.chapter9.SpringTesting.modle.Employee;

public class EmployeeServiceIntegrationTest {

	private static final String OLD_EMPLOYEE_ID = "12121";
	private static final String NEW_EMPLOYEE_ID = "53535";

	private Employee oldEmployee;
	private Employee newEmployee;
	private EmployeeService employeeService;

	@Before
	public void setUp() {
		oldEmployee = new Employee(OLD_EMPLOYEE_ID, "Ravi", "Soni", 1001);
		newEmployee = new Employee(NEW_EMPLOYEE_ID, "Shashi", "Soni", 3001);

		employeeService = new EmployeeServiceImpl(
				new InMemeoryEmployeeDaoImpl());
		employeeService.createEmployee(oldEmployee);
	}

	@Test
	public void isOldEmployeeTest() {
		Assert.assertTrue(employeeService.isOldEmployee(OLD_EMPLOYEE_ID));
		Assert.assertFalse(employeeService.isOldEmployee(NEW_EMPLOYEE_ID));
	}

	@Test
	public void createNewEmployeeTest() {
		employeeService.createEmployee(newEmployee);
		Assert.assertTrue(employeeService.isOldEmployee(NEW_EMPLOYEE_ID));
	}

	@Test
	public void updateEmployeeTest() {
		String firstName = "Sharee";
		oldEmployee.setFirstName(firstName);
		employeeService.updateEmployee(oldEmployee);
		Assert.assertEquals(firstName,
				employeeService.findEmployee(OLD_EMPLOYEE_ID).getFirstName());
	}

	@Test
	public void deleteEmployeeTest() {
		employeeService.deleteEmployee(OLD_EMPLOYEE_ID);
		Assert.assertFalse(employeeService.isOldEmployee(OLD_EMPLOYEE_ID));
	}

}
