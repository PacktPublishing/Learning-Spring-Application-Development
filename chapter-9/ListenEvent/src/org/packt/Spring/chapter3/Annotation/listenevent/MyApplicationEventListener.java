package org.packt.Spring.chapter3.Annotation.listenevent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationEventListener implements
		ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {

		System.out.println("Context Started Event Received");

	}
}
