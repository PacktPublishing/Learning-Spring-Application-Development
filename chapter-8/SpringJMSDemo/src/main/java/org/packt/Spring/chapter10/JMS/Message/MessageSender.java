package org.packt.Spring.chapter10.JMS.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;

	public void send(final Object Object) {
		jmsTemplate.convertAndSend(Object);
	}	
}
