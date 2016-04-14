package org.packt.springframework.chapter3.SpEL.operator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Calculator calculator = (Calculator)context.getBean("calculator");
		
		System.out.println(calculator.getAddition());
		
	}

}
