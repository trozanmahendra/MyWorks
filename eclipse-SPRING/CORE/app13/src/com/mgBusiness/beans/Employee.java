package com.mgBusiness.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import lombok.Getter;
import lombok.Setter;


public class Employee {
	private String eid;
	private String ename;
	private String esal;
	private Account account;
	
	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsal() {
		return esal;
	}

	public void setEsal(String esal) {
		this.esal = esal;
	}

	public Account getAccount() {
		return account;
	}
//	@Required
	@Autowired(required = false)
	@Qualifier("accc")
	public void setAccount(Account account) {
		this.account = account;
	}

	public void getEmpDetails() {
		System.out.println("Employee Details\n-------------------------------");
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		account.getAccDetails();
	}

}
