package org.packt.spring.chapter6.hibernate.dao;

import java.util.List;

import org.packt.spring.chapter6.hibernate.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees();

	public void insertEmployee(Employee employee);

	public List<Employee> hqlUsingFromClause();

	public List<Employee> hqlUsingFromClauseFullyQualified();

	public List<Employee> hqlUsingAsClause();

	public List<Employee> hqlUsingAsClauseOptional();
	
	public List<String> hqlUsingSelectClause();
}
