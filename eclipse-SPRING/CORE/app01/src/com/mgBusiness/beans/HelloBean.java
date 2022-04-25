package com.mgBusiness.beans;

public class HelloBean {
	static{
		System.out.println("Bean class loading");
	}
	public HelloBean() {
		System.out.println("Bean instantiation");
	}
	public String sayHello() {
		return "Hello user";
	}

}
