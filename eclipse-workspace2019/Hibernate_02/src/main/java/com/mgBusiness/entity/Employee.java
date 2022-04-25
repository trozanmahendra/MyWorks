package com.mgBusiness.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int eid;
	String ename;
	float esal;
	String addr;

	public Employee(String ename, float esal, String addr) {
		super();
		
		this.ename = ename;
		this.esal = esal;
		this.addr = addr;
	}
	@Override
	public String toString() {
		
		return this.ename+" : "+this.addr+" : "+this.eid+" : "+this.esal ;
	}

}
