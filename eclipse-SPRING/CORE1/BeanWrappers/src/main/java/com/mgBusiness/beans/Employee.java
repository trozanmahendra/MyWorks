package com.mgBusiness.beans;

public class Employee {
	private final int i=10;
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
	public int getI() {
		return i;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
	public void getEmployeeDetails() {
		System.out.println("\nEmployee Details"+"\n---------------------");
		System.out.println("Employee number  : "+getEno());
		System.out.println("Employee name    : "+getEname());
		System.out.println("Employee salary  : "+getEsal());
		System.out.println("Employee address : "+getEaddr());
	}

}
