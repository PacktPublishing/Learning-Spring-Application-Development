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

	public void insertEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> listEmployee() {
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee";
		Query query = session.createQuery(hql);
		List<Employee> empList = query.list();
		logger.info("Person List::" + empList);
		return empList;
	}

	public void deleteEmployee(Integer employeeId) {
		System.out.println("hql Using Delete");
		Session session = sessionFactory.openSession();
		String hql = "DELETE from Employee E WHERE E.id = :employee_id";
		Query query = session.createQuery(hql);
		query.setParameter("employee_id", employeeId);
		int result = query.executeUpdate();
		System.out.println("Row affected: " + result);
	}
}
