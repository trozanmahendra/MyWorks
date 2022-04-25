package com.mgBusiness.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.Branch;
import com.mgBusiness.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mgBusiness/resources/applicationContext.xml");
		Student stu = (Student)context.getBean("student");
		System.out.println(stu.getStudentName());
		Branch br = (Branch)context.getBean("branch");
		System.out.println(br.getBranchName());

	}

}
