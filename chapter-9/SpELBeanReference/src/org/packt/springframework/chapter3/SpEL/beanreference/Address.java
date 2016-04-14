package org.packt.springframework.chapter3.SpEL.beanreference;

public class Address {
	private Long id;
	private String streetName;
	private String country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFullAddress() {
		return streetName + " " + country;
	}

}
