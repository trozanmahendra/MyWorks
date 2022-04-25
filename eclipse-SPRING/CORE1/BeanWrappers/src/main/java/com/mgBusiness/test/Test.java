package com.mgBusiness.test;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.mgBusiness.beans.Employee;

public class Test {

	public static void main(String[] args) {

		Class<Employee> e = Employee.class;
		BeanWrapper bw = new BeanWrapperImpl(e);
		bw.setPropertyValue("eno", 100);
		bw.setPropertyValue("ename", "MAHENDRA");
		bw.setPropertyValue("esal", 50000);
		bw.setPropertyValue("eaddr", "KNL");

		System.out.println("Employee Details" + "\n---------------------");
		System.out.println("Employee number  : " + bw.getPropertyValue("eno"));
		System.out.println("Employee name    : " + bw.getPropertyValue("ename"));
		System.out.println("Employee salary  : " + bw.getPropertyValue("esal"));
		System.out.println("Employee address : " + bw.getPropertyValue("eaddr"));

		Map<String, Object> m = new Hashtable<String, Object>();
		m.put("eno", 200);
		m.put("ename", "Bharath");
		m.put("esal", 200000);
		m.put("eaddr", "HYD");

		Employee emp = (Employee) bw.getWrappedInstance();
		bw.setPropertyValues(m);
		emp.getEmployeeDetails();

		System.out.println(bw.isReadableProperty("i"));
		System.out.println(bw.isWritableProperty("i"));

		var emp1 = new Employee();
		BeanUtils.copyProperties(emp, emp1);
		System.out.println();
		emp1.getEmployeeDetails();

	}
}
