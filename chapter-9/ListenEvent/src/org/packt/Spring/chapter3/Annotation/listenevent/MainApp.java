package org.packt.Spring.chapter3.Annotation.listenevent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				" beans.xml");

		context.start();

	}

}
