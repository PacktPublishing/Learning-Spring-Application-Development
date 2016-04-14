package org.packt.springframework.chapter3.SpEL.beanreference;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class Customer {

	private String custName;
	private Address address;

	private String country;

	@Value("#{addressBean.getFullAddress()}")
	private String fullAdress;

	public String getCustName() {
		return custName;
	}

	public String getFullAdress() {
		return fullAdress;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
