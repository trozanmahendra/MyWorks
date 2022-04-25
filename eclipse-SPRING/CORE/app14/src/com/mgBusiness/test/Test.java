package com.mgBusiness.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.Original;

public class Test {
public static void main(String[] mg) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/mgBusiness/resources/applicationContext.xml");
	Original original = (Original)context.getBean("original");
	original.originalMeth();
}
}
