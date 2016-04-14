package org.packt.Spring.chapter9.SpringTesting.service;

import org.packt.Spring.chapter9.SpringTesting.dao.EmployeeDao;
import org.packt.Spring.chapter9.SpringTesting.modle.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao = null;

	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public boolean isOldEmployee(String employeeId) {
		return employeeDao.isOldEmployee(employeeId);
	}

	@Override
	public void createEmployee(Employee employee) {
		employeeDao.createEmployee(employee);
	}

	@Override
	public Employee findEmployee(String employeeId) {
		return employeeDao.findEmployee(employeeId);
	}

	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	public void deleteEmployee(String employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}
}
