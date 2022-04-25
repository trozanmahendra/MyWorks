package com.mgBusiness.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.StudentBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context;
		try {
			context = new ClassPathXmlApplicationContext("com/mgBusiness/resourses/applicationContext.xml");
			StudentBean sb = (StudentBean)context.getBean("studBean");
			sb.getStudentDetails();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
