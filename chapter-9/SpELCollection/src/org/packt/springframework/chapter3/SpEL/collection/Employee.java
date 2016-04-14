package org.packt.springframework.chapter3.SpEL.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("employeeBean")
public class Employee {

	private Map<String, String> map;
	private List<String> list;

	Employee() {
		map = new HashMap<String, String>();
		map.put("emp1", "Employee 1");
		map.put("emp2", "Employee 2");

		list = new ArrayList<String>();
		list.add("employee-1");
		list.add("employee-2");
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

}
