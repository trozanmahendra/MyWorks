package com.mgBusiness.beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("-------------------");
		System.out.println("Emp no    : "+eno);
		System.out.println("Emp name  : "+ename);
		System.out.println("Emp esal  : "+eaddr);
	}

}
