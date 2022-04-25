package com.mgBusiness.beans;

public class HelloBean {

	private String name;
	private String greet;
	public void init() {
		System.out.println("init()-method");
		name = "Bharath";
		greet = "Good Evening";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("first me setname()-Mahendra");
		this.name = name;
	}

	public String getGreet() {
		
		return greet;
	}

	public void setGreet(String greet) {
		System.out.println("first me setname()-good morning");
		this.greet = greet;
	}

	

	public void destroy() {
		System.out.println("destroy()-Method");
		greet = "Good night";
	}

	public String sayHello() {
		return name + "! " + greet;
	}

}
