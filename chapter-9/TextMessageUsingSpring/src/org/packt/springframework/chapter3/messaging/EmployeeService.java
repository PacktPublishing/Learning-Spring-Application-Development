package org.packt.springframework.chapter3.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private MessageSource messageSource;

	@Override
	public String toString() {
		return messageSource.getMessage("user.welcome", null,
				"Default Greeting", null);
	}

}
