package com.mgBusiness.beans;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Customer {
	private String cid;
	private String cname;
	private String caddr;
	private ArrayList<String> good_price;
	
//	public Customer(String cid, String cname, String caddr,ArrayList<String> good_price ) {
//		super();
//		this.cid = cid;
//		this.cname = cname;
//		this.caddr = caddr;
//		this.good_price=good_price;
//		System.out.println("------------constructorDependencyInjection---------------------");
//	}
	public void getCustomerDetails() {
		System.out.println("Customer Details\n--------------------------------");
		System.out.println("Customer ID : "+cid);
		System.out.println("Name        : "+cname);
		System.out.println("Address     : "+caddr);
		System.out.println("Goods & price : "+good_price);
	}

}
