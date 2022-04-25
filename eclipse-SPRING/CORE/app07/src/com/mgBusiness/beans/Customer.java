package com.mgBusiness.beans;

public class Customer {
	private String name;
	private String mobile;
	private String mail;
	private Address addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public void getCustomerDetails() {

		System.out.println("-----------Customer Details----------");
		System.out.println();
		System.out.println("Name      : " + name);
		System.out.println("Mobile No : " + mobile);
		System.out.println("Mail      : " + mail);
		System.out.println();
		System.out.println("------------Address-----------");
		System.out.println();
//		addr.getAddress();
	}

}
