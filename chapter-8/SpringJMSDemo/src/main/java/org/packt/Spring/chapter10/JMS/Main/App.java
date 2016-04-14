package org.packt.Spring.chapter10.JMS.Main;

import java.util.HashMap;
import java.util.Map;

import org.packt.Spring.chapter10.JMS.Message.MessageSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Note: Run activemq before to run App.java
 * 
 * @author t_raviso
 * 
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring.xml");

		MessageSender messageSender = (MessageSender) context
				.getBean("messageSender");

		Map<String, String> message = new HashMap<String, String>();
		message.put("Hello", "World");
		message.put("city", "Sasaram");
		message.put("state", "Bihar");
		message.put("country", "India");
		
		messageSender.send(message);

		System.out.println("Message Sent to JMS Queue: " + message);

	}
}
