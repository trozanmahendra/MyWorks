package com.mgBusiness.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mgBusiness.beans.WelcomeBean;
import com.mgBusiness.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context;
		try {
			context = new AnnotationConfigApplicationContext(AppConfig.class);
			WelcomeBean wBean1  = (WelcomeBean) context.getBean("welcomeBean");
			System.out.println(wBean1.welcome_Bean());

			WelcomeBean wBean2  = context.getBean(WelcomeBean.class);
			System.out.println(wBean2.welcome_Bean());

			System.out.println(wBean1 == wBean2);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
