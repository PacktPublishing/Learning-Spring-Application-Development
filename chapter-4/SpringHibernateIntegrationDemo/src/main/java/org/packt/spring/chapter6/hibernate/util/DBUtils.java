package org.packt.spring.chapter6.hibernate.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBUtils {

	@Autowired
	private DataSource dataSource;

	@PostConstruct
	public void initialize() {
		try {
			Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			statement.execute("DROP TABLE IF EXISTS EMPLOYEE");
			statement.executeUpdate("CREATE TABLE EMPLOYEE (ID INTEGER, "
					+ "NAME VARCHAR(50), EMAIL VARCHAR(100))");
			statement.executeUpdate("INSERT INTO EMPLOYEE (ID, NAME, EMAIL) "
					+ "VALUES (101, 'Ravi', 'ravikantsoni03@gmail.com')");
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
