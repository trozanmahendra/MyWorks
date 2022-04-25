package entity;

import annotations.Institute;

public class Student {
	String sid;
	String sname;
	String saddress;
	public Student(String sid,String sname,String saddress){
		this.sname=sname;
		this.sid=sid;
		this.saddress=saddress;	
	}
	@Institute()
	public void getStudentDetails() {
		System.out.println("Student Details"+"\n---------------");
		System.out.println("Student ID      :  "+sid);
		System.out.println("Student Name    :  "+sname);
		System.out.println("Student Address :  "+saddress);
		
	}  

}
