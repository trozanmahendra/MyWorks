package com.mgBusiness.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

	public String sayHello() {
		return name + "! " + greet;
	}

	@PostConstruct
	public void initializeBean() {
		System.out.println("initializwe mbean method");
		name = "Mahendra";
		greet = "GM";
	}

	@PreDestroy
	public void destroyBean() {
		System.out.println("destroy method");
	}

}
