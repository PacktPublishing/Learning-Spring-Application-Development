package org.packt.spring.chapter6.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.packt.spring.chapter6.hibernate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Employee> getAllEmployees() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> emList = (List<Employee>) criteria.list();
		return emList;
	}

	public void insertEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
	}
}
