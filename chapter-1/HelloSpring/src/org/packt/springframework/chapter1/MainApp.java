package org.packt.springframework.chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");

		System.out.println(helloWorld.getMessage());

	}

}
