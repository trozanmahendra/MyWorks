package com.mgBusiness.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean, DisposableBean {

	private String name;
	private String greet;

	public void init() {
		System.out.println("init()-method");

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

	public String sayHello() {
		return name + "! " + greet;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()  invaded here");
		name = "Bharath";
		greet = "Good Evening";

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()-Method from didposabale");
		greet = "Good night";
	}

}
