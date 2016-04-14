package org.packt.springframework.chapter3.SpEL.regularexpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		Client client = (Client) context.getBean("clientBean");
		System.out.println(client.getValidEmail());
	}

}
