package org.packt.spring.chapter6.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
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
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> emList = criteria.list();
		return emList;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> criteriaRestrictionUsingOrder() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.addOrder(Order.desc("id"));
		List<Employee> emList = criteria.list();
		return emList;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> criteriaRestrictionUsingOR() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Criterion jobTitle = Restrictions.eq("jobTitle", "AUTHOR");
		Criterion firstName = Restrictions.like("lastName", "Kant");
		LogicalExpression andExp = Restrictions.or(jobTitle, firstName);
		criteria.add(andExp);
		List<Employee> emList = criteria.list();
		return emList;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> criteriaRestrictionUsingAND() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Criterion salary = Restrictions.eq("salary", 5000);
		Criterion firstName = Restrictions.like("lastName", "Soni");
		LogicalExpression andExp = Restrictions.and(salary, firstName);
		criteria.add(andExp);
		List<Employee> emList = criteria.list();
		return emList;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> criteriaRestrictionUsingIsNotNull() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.isNotNull("salary"));
		List<Employee> emList = criteria.list();
		return emList;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> criteriaRestrictionUsingIsNull() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.isNull("salary"));
		List<Employee> emList = criteria.list();
		return emList;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> criteriaRestrictionUsingBetween() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.between("salary", 4000, 5000));
		List<Employee> emList = criteria.list();
		return emList;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> criteriaRestrictionUsingLike() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.like("firstName", "RAVI"));
		List<Employee> emList = criteria.list();
		return emList;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> criteriaRestrictionUsingEq() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("salary", 5000));
		List<Employee> emList = criteria.list();
		return emList;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> criteriaRestrictionUsingGt() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("id", 1));
		List<Employee> emList = criteria.list();
		return emList;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> criteriaRestrictionUsingLt() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.lt("id", 3));
		List<Employee> emList = criteria.list();
		return emList;
	}

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> hqlUsingFromClause() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> hqlUsingFromClauseFullyQualified() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> hqlUsingAsClause() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> hqlUsingAsClauseOptional() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> hqlUsingSelectClause() {
		// TODO Auto-generated method stub
		return null;
	}

}
