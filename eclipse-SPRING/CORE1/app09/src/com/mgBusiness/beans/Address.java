package com.mgBusiness.beans;

import lombok.Data;

@Data
public class Address {
	private String pno;
	private String street;
	private String city;
	private String state;
	
public void getAddress() {
	System.out.println("Employee Address");
	System.out.println("--------------------------------------");
	System.out.println("Plot no : "+pno);
	System.out.println("Street  : "+street);
	System.out.println("City    : "+city);
	System.out.println("State   : "+state);
}
}
