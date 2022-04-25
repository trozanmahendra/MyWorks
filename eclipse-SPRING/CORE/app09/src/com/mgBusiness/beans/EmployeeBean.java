package com.mgBusiness.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.SortedMap;
import java.util.SortedSet;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeBean {
	private String ename;
	private String eid;
	private float esal;
	private Address addr;
	private List<String> equal;
	private SortedSet<String> ecourses;
	private SortedMap<String, String> quals_percentages;
	private Properties courses_price;

	public void getEmployeeDetails() {
		int i=0,j=0;
		System.out.println("Employee Details");
		System.out.println("-------------------------------");
		System.out.println("Emp Name                : " + ename);
		System.out.println("Emp ID                  : " + eid);
		System.out.println("Emp Salary              : " + esal);
		System.out.print("Employee Qualifications : ");
		for (String qual : equal) {
			i++;
			
			System.out.print(qual);
			if(i==equal.size()) {
				System.out.print("...............");
			}else {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.print("Employee Courses        : ");
		for(String course : ecourses) {
			j++;
			System.out.print(course);
			if(j==ecourses.size()) {
				System.out.print("...............");
			}else {
				System.out.print(",");
			}
		}
		
		System.out.println("\n");
		System.out.println("Qualifications And percentages : "+quals_percentages);
		System.out.println("Courses AND Price : "+courses_price);
		addr.getAddress();

	}
}
