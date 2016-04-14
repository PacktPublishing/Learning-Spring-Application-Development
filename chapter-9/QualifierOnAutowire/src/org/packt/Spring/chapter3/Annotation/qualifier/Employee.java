package org.packt.Spring.chapter3.Annotation.qualifier;

public class Employee {
	
	String str;
	
	public  void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "From employee class: " + str;
	}

}
