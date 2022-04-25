package com.mgBusiness.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Account {
	@Id
	int sno;
	String accNo;
	String accName;
	String addr;
	public Account(String accNo, String accName, String addr) {
		
		this.accNo = accNo;
		this.accName = accName;
		this.addr = addr;
	}
	
	}
