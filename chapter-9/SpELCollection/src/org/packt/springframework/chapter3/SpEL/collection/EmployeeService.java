package org.packt.springframework.chapter3.SpEL.collection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	@Value("#{employeeBean.map['emp1']}")
	private String mapElement;

	@Value("#{employeeBean.list[0]}")
	private String listElement;

	public String getMapElement() {
		return mapElement;
	}

	public void setMapElement(String mapElement) {
		this.mapElement = mapElement;
	}

	public String getListElement() {
		return listElement;
	}

	public void setListElement(String listElement) {
		this.listElement = listElement;
	}

}
