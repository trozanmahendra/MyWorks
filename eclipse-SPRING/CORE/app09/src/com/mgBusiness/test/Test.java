package com.mgBusiness.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.EmployeeBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context;
		try {
			int i = 0;
			context = new ClassPathXmlApplicationContext("com/mgBusiness/resources/applicationContext.xml");
			EmployeeBean employeeBean = (EmployeeBean) context.getBean("employeeBean");
			employeeBean.getEmployeeDetails();

			List<String> l = new ArrayList<String>();
			l.add("mg");
			l.add("Bg");
			l.add("sg");

			for (String s : l) {
				i++;
				System.out.print(s);
				if (i == l.size()) {
					System.out.print("..");
				} else {
					System.out.print(",");
				}

			}
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
