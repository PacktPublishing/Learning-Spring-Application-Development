package org.packt.Spring.chapter3.Annotation.publishevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		LoginEventPublisher loginEventPublisher = (LoginEventPublisher) context
				.getBean("loginEventPublisher");

		loginEventPublisher.publish();
	}

}
