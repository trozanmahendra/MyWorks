package com.mgBusiness.test;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.HelloBean;

public class Test {
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mgBusiness/resources/applicationContext.xml")) {
			HelloBean hb = (HelloBean) context.getBean("helloBean");
			System.out.println(hb.sayHello());

			context.registerShutdownHook();

		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
