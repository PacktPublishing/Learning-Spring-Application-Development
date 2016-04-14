package org.packt.springframework.chapter3.SpEL.regularexpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emailBean")
public class Email {

	@Value("spam@abc.com")
	String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
