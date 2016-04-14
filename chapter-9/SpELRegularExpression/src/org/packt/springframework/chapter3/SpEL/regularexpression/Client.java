package org.packt.springframework.chapter3.SpEL.regularexpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("clientBean")
public class Client {

	// email regular expression
	String emailRegEx = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)"
			+ "*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	// emailBean.emailAddress contains valid email address?
	@Value("#{emailBean.emailAddress matches clientBean.emailRegEx}")
	private Boolean validEmail;

	public String getEmailRegEx() {
		return emailRegEx;
	}

	public void setEmailRegEx(String emailRegEx) {
		this.emailRegEx = emailRegEx;
	}

	public Boolean getValidEmail() {
		return validEmail;
	}

	public void setValidEmail(Boolean validEmail) {
		this.validEmail = validEmail;
	}

}
