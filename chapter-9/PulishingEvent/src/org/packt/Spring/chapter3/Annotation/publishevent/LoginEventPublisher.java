package org.packt.Spring.chapter3.Annotation.publishevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class LoginEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publish() {
		LoginEvent loginEvent = new LoginEvent(this);
		publisher.publishEvent(loginEvent);
	}

}
