package org.packt.Spring.chapter9.SpringTesting.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.packt.Spring.chapter9.SpringTesting.modle.Employee;

public class InMemeoryEmployeeDaoImpl implements EmployeeDao {

	private Map<String, Employee> employees;

	public InMemeoryEmployeeDaoImpl() {
		employees = Collections
				.synchronizedMap(new HashMap<String, Employee>());
	}

	public boolean isOldEmployee(String employeeId) {
		return employees.containsKey(employeeId);
	}

	@Override
	public void createEmployee(Employee employee) {
		if (!isOldEmployee(employee.getEmployeeId())) {
			employees.put(employee.getEmployeeId(), employee);
		}
	}

	@Override
	public void updateEmployee(Employee employee) {
		if (isOldEmployee(employee.getEmployeeId())) {
			employees.put(employee.getEmployeeId(), employee);
		}
	}

	@Override
	public void deleteEmployee(String employeeId) {
		if (isOldEmployee(employeeId)) {
			employees.remove(employeeId);
		}
	}

	@Override
	public Employee findEmployee(String employeeId) {
		return employees.get(employeeId);
	}
}
