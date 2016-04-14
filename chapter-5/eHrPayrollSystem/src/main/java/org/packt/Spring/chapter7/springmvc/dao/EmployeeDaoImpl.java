package org.packt.Spring.chapter7.springmvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.packt.Spring.chapter7.springmvc.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static final Logger logger = LoggerFactory
			.getLogger(EmployeeDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Employee> listEmployee() {
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee";
		Query query = session.createQuery(hql);
		List<Employee> empList = query.list();
		logger.info("Person List::" + empList);
		return empList;
	}

	public void removeEmployee(Integer employeeId) {
		// TODO Auto-generated method stub

	}

	public void addEmployee(Employee employeee) {
		// TODO Auto-generated method stub

	}

}
