package org.packt.Spring.chapter5.JDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.packt.Spring.chapter5.JDBC.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int getEmployeeCount() {
		String sql = "select count(*) from employee";
		return jdbcTemplate.queryForInt(sql);
	}

	@Override
	public int insertEmployee(Employee employee) {
		String inserQuery = "insert into employee (EmpId, Name, Age) values (?, ?, ?) ";
		Object[] params = new Object[] { employee.getEmpId(),
				employee.getName(), employee.getAge() };
		int[] types = new int[] { Types.INTEGER, Types.VARCHAR, Types.INTEGER };
		return jdbcTemplate.update(inserQuery, params, types);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		String query = "select * from Employee where EmpId = ?";
		// using RowMapper anonymous class, we can create a separate RowMapper
		// for reuse
		Employee employee = jdbcTemplate.queryForObject(query,
				new Object[] { empId }, new RowMapper<Employee>() {
					@Override
					public Employee mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Employee employee = new Employee(rs.getInt("EmpId"), rs
								.getString("Name"), rs.getInt("Age"));
						return employee;
					}
				});
		return employee;
	}

	@Override
	public int deleteEmployeeById(int empId) {
		String delQuery = "delete from employee where EmpId = ?";
		return jdbcTemplate.update(delQuery, new Object[] { empId });
	}
	
	@Override
	public void createEmployee() {		
		jdbcTemplate.execute("create table employee (EmpId integer, Name char(30), Age integer)");
	}
}
