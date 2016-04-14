package org.packt.springframework.chapter3.SpEL.beanreference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		Customer customer = (Customer) context.getBean("customerBean");
		System.out.println(customer.getCountry());
		System.out.println(customer.getFullAdress());
	}

}
