package com.mgBusiness.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.Customer;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mgBusiness/resources/applicationContext.xml");
		Customer cust = (Customer) context.getBean("customer");
		cust.getCustomerDetails();

	}

}
