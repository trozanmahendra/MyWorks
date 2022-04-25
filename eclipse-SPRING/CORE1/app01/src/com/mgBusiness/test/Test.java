package com.mgBusiness.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.HelloBean;
import com.mgBusiness.scopes.ThreadScope;

public class Test {
	public static void main(String[] args) {
		
		
//		BeanFactory context = new XmlBeanFactory(new ClassPathResource("com/mgBusiness/resources/applicationContext.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/mgBusiness/resources/applicationContext.xml");
		HelloBean helloBean1= (HelloBean)context.getBean("hello");
		HelloBean helloBean2 = (HelloBean)context.getBean("hello");
		
		System.out.println(helloBean1.sayHello());
		System.out.println(helloBean2.sayHello());
		
		System.out.println(helloBean1);
		System.out.println(helloBean2);
		
		ThreadScope threadScope = (ThreadScope)context.getBean("threadScope");
		HelloBean helloBean = (HelloBean)threadScope.remove("hello");
		
		System.out.println(helloBean);
		
		HelloBean helloBean3 = (HelloBean)context.getBean("hello");
		System.out.println(helloBean3);
		
		HelloBean helloBean4 = (HelloBean)threadScope.remove("hello");
		System.out.println(helloBean4);
	}

}
