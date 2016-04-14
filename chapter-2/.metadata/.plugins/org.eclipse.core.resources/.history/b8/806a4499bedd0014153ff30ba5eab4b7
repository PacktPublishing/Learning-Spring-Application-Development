package org.packt.Spring.chapter2.loosecouple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <ol>
 * <li>you just need to change the Spring XML file for a different
 * EmployeeServiceImp.</li>
 * <li>When EmployeeServiceImp changed, you need to modify the Spring XML file
 * only, no code changed, means less error.</li>
 * </ol>
 * 
 * @author RaviKantSoni
 */
public class PayrollSystem {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		EmployeeService employeeService = (EmployeeService) context
				.getBean("employeeServiceBean");

		System.out.println(employeeService.generateEployeeID());

	}

}
