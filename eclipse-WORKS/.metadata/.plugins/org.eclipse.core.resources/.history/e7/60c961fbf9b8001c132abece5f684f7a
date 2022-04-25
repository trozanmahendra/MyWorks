package com.mgBusiness.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.dao.EmployeeDao;
import com.mgBusiness.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mgBusiness/resources/ApplicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		Employee emp = new Employee();
		emp.setEaddr("KNL");
		emp.setEid(200);
		emp.setEname("Mahendra");
		emp.setEsal(50000);
		String status = employeeDao.add(emp);
		System.out.println(status);
	}

}
