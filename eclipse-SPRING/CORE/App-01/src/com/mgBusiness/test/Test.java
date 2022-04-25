package com.mgBusiness.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.mgBusiness.beans.Employee;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) {
		Resource resourse = new ClassPathResource("com/mgBusiness/resourses/applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resourse);
		Employee emp = (Employee)beanFactory.getBean("employeeBean");
		emp.getEmpDetails();
		
	}
}
