package org.packt.spring.chapter6.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.packt.spring.chapter6.hibernate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee";
		Query query = session.createQuery(hql);
		List<Employee> emList = query.list();
		return emList;
	}

	@Transactional(readOnly = false)
	public void insertEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		session.save(employee);
	}

	public List<Employee> hqlUsingFromClause() {
		System.out.println("hql Using From Clause");
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee";
		Query query = session.createQuery(hql);
		return query.list();
	}

	public List<Employee> hqlUsingFromClauseFullyQualified() {
		System.out.println("hql Using From Clause Fully Qualified");
		Session session = sessionFactory.openSession();
		String hql = "FROM org.packt.spring.chapter6.hibernate.model.Employee";
		Query query = session.createQuery(hql);
		return query.list();
	}

	public List<Employee> hqlUsingAsClause() {
		System.out.println("hql Using As Clause");
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee AS E";
		Query query = session.createQuery(hql);
		return query.list();
	}

	public List<Employee> hqlUsingAsClauseOptional() {
		System.out.println("hql Using As Clause Optional");
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee E";
		Query query = session.createQuery(hql);
		return query.list();
	}

	public List<String> hqlUsingSelectClause() {
		System.out.println("hql Using Select Clause");
		Session session = sessionFactory.openSession();
		String hql = "SELECT E.firstName FROM Employee E";
		Query query = session.createQuery(hql);
		return query.list();
	}

	public List<Employee> hqlUsingWhereClause() {
		System.out.println("hql Using Where Clause");
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee E WHERE E.firstName='RAVI'";
		Query query = session.createQuery(hql);
		return query.list();
	}

	public List<Employee> hqlUsingOrderByClause() {
		System.out.println("hql Using Order By Clause");
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee E ORDER BY E.firstName DESC";
		Query query = session.createQuery(hql);
		return query.list();
	}
	
	public List<Employee> hqlUsingOrderByClauseForMore() {
		System.out.println("hql Using Order By Clause");
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee E ORDER BY E.firstName DESC, E.id DESC";
		Query query = session.createQuery(hql);
		return query.list();
	}

	public List<Long> hqlUsingGroupByClause() {
		System.out.println("hql Using Group By Clause");
		Session session = sessionFactory.openSession();
		String hql = "SELECT SUM(E.salary) FROM Employee E GROUP BY E.firstName";
		Query query = session.createQuery(hql);
		List<Long> grouupList = query.list();
		return grouupList;
	}

	public List<Employee> hqlUsingNamedParameter() {
		System.out.println("hql Using Named Parameter");
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee E WHERE E.firstName = :employee_firstName";
		Query query = session.createQuery(hql);
		query.setParameter("employee_firstName", "Shree");
		return query.list();
	}

	public void hqlUsingUpdate() {
		System.out.println("hql Using Update");
		Session session = sessionFactory.openSession();
		String hql = "UPDATE Employee E set E.firstName = :name WHERE id = :employee_id";
		Query query = session.createQuery(hql);
		query.setParameter("name", "Shashi");
		query.setParameter("employee_id", 3);
		int result = query.executeUpdate();
		System.out.println("Row affected: " + result);
	}

	public void hqlUsingDelete() {
		System.out.println("hql Using Delete");
		Session session = sessionFactory.openSession();
		String hql = "DELETE from Employee E WHERE E.id = :employee_id";
		Query query = session.createQuery(hql);
		query.setParameter("employee_id", 3);
		int result = query.executeUpdate();
		System.out.println("Row affected: " + result);
	}

	public void hqlUsingInsertInto() {
		System.out.println("hql Using Insert Into");
		Session session = sessionFactory.openSession();
		String hql = "INSERT INTO Employee E (name, age) SELECT name, age from old_employee";
		Query query = session.createQuery(hql);
		int result = query.executeUpdate();
		System.out.println("Row affected: " + result);
	}

	public List<Employee> hqlUsingPagination() {
		System.out.println("hql Using Pagination");
		Session session = sessionFactory.openSession();
		String hql = "FROM Employee";
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(1);
		return query.list();
	}

}
