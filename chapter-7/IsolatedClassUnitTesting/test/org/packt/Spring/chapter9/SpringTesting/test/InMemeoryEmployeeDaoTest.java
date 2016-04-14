package org.packt.Spring.chapter9.SpringTesting.test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.packt.Spring.chapter9.SpringTesting.dao.InMemeoryEmployeeDaoImpl;
import org.packt.Spring.chapter9.SpringTesting.modle.Employee;

public class InMemeoryEmployeeDaoTest {

	private static final String OLD_EMPLOYEE_ID = "12121";
	private static final String NEW_EMPLOYEE_ID = "53535";

	private Employee oldEmployee;
	private Employee newEmployee;
	private InMemeoryEmployeeDaoImpl empDao;

	@Before
	public void setUp() {
		oldEmployee = new Employee(OLD_EMPLOYEE_ID, "Ravi", "Soni", 1001);
		newEmployee = new Employee(NEW_EMPLOYEE_ID, "Shashi", "Soni", 3001);

		empDao = new InMemeoryEmployeeDaoImpl();
		empDao.createEmployee(oldEmployee);
	}

	@Test
	public void isOldEmployeeTest() {
		Assert.assertTrue(empDao.isOldEmployee(OLD_EMPLOYEE_ID));
		Assert.assertFalse(empDao.isOldEmployee(NEW_EMPLOYEE_ID));
	}

	@Test
	public void createNewEmployeeTest() {
		empDao.createEmployee(newEmployee);
		Assert.assertTrue(empDao.isOldEmployee(NEW_EMPLOYEE_ID));
	}

	@Test
	public void updateEmployeeTest() {
		String firstName = "Sharee";
		oldEmployee.setFirstName(firstName);
		empDao.updateEmployee(oldEmployee);
		Assert.assertEquals(firstName, empDao.findEmployee(OLD_EMPLOYEE_ID)
				.getFirstName());
	}

	@Test
	public void deleteEmployeeTest() {
		empDao.deleteEmployee(OLD_EMPLOYEE_ID);
		Assert.assertFalse(empDao.isOldEmployee(OLD_EMPLOYEE_ID));
	}
}
