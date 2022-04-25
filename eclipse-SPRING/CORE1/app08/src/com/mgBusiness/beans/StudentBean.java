package com.mgBusiness.beans;

public class StudentBean {
	private String name;
	private String id;
	private String course;
	private String mobile;
	private String mail;

	public StudentBean(String name, String id, String course, String mobile, String mail) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
		this.mobile = mobile;
		this.mail = mail;
	}

	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("----------------------");
		System.out.println("Name   : " + name);
		System.out.println("Id     : " + id);
		System.out.println("course : " + course);
		System.out.println("mobile : " + mobile);
		System.out.println("MAil   : " + mail);
	}

}
