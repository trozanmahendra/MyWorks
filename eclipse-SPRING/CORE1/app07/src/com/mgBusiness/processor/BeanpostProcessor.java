package com.mgBusiness.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.mgBusiness.beans.Address;
import com.mgBusiness.beans.Customer;

public class BeanpostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Customer cust = (Customer) bean;
		String name = cust.getName();
		if (name.length() == 0) {
			cust.setName("MGOUD");
		}
		return cust;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String customer) throws BeansException {
		Customer cust = (Customer) bean;
		String mobile = cust.getMobile();
		if (mobile.length() == 10) {
			mobile = "91-" + mobile;
			cust.setMobile(mobile);
		}
		String mail = cust.getMail();
		if (!mail.contains("@")) {
			mail = mail + "@mg.com";
			cust.setMail(mail);
		}
		return cust;
	}
}
