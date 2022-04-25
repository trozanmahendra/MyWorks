package com.mgBusiness.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.Customer;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mgBusiness/resources/applicationContext.xml");
		Customer cust = (Customer)context.getBean("customer");
		cust.getCustomerDetails();
		
	}

}
