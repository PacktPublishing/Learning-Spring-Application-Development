package org.packt.Spring.chapter3.Annotation.publishevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LoginEventListner implements ApplicationListener<LoginEvent> {

	@Override
	public void onApplicationEvent(LoginEvent event) {

		if (event instanceof LoginEvent) {
			System.out.println(event);
		}
	}
}
