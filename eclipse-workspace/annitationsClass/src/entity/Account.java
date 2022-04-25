package entity;

import annitations.Bank;

@Bank
public class Account {
	String AccNo;
	String AccHolderName;
	String AccType;
	int AccBalance;
	public Account(String AccNo,String AccHolderName,String AccType,int AccBalance) {
		this.AccNo=AccNo;
		this.AccHolderName=AccHolderName;
		this.AccType=AccType;
		this.AccBalance=AccBalance;
	}
	public void getDetails() {
		System.out.println("Account Details"+"\n-------------------");
		System.out.println("Account Number      :  "+AccNo);
		System.out.println("Account Holder Name :  "+AccHolderName);
		System.out.println("Account Type        :  "+AccType);
		System.out.println("Account Balance     :  "+AccBalance);
	}

}
