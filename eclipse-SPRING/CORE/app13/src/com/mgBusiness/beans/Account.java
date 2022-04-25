package com.mgBusiness.beans;

import org.springframework.beans.factory.annotation.Required;

import lombok.Getter;
import lombok.Setter;


public class Account {
private String accNo;
private String accName;
private String accBranch;

public String getAccNo() {
	return accNo;
}

public void setAccNo(String accNo) {
	this.accNo = accNo;
}

public String getAccName() {
	return accName;
}

public void setAccName(String accName) {
	this.accName = accName;
}

public String getAccBranch() {
	return accBranch;
}

public void setAccBranch(String accBranch) {
	this.accBranch = accBranch;
}


public void getAccDetails() {
	System.out.println("Account details\n-------------------------");
	System.out.println(accNo);
	System.out.println(accName);
	System.out.println(accBranch);
}
}
