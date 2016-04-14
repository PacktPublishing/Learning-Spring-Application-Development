package org.packt.Spring.chapter3.Annotation.publishevent;

import org.springframework.context.ApplicationEvent;

public class LoginEvent extends ApplicationEvent{

	public LoginEvent(Object source) {
		super(source);
	}
	
	public String toString() {
		return "Hallo World";
	}

}
