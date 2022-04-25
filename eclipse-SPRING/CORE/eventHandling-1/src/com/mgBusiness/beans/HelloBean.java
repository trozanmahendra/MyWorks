package com.mgBusiness.beans;

public class HelloBean {
	private String name;
	private String greet;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGreet() {
		return greet;
	}
	public void setGreet(String greet) {
		this.greet = greet;
	}
public String greeting() {
	return greet+" "+name;
	
}

}
