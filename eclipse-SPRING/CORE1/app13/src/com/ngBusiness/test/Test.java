package com.ngBusiness.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/mgBusiness/resources/applicationContext.xml");
		Employee emp = (Employee)context.getBean("emp");
		emp.getEmpDetails();
	}

}
