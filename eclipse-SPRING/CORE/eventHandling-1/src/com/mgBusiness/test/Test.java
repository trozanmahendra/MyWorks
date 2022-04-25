package com.mgBusiness.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.HelloBean;

public class Test {
public static void main(String[] mg) {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/mgBusiness/resources/applicationContext.xml");
	HelloBean helloBean = (HelloBean) context.getBean("hellobean");
	System.out.println(helloBean.greeting());
	context.start();
	System.out.println(helloBean.greeting());
	context.refresh();
	context.stop();
	System.out.println(helloBean.greeting());
	context.close();
	System.out.println(helloBean.greeting());
}

}
