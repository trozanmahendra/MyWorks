package com.mgBusiness.beans;

public class Address {
	private int HNO;
	private String colony;
	private String city;
	private String state;

	public int getHNO() {
		return HNO;
	}

	public void setHNO(int hNO) {
		HNO = hNO;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void getAddress() {

		System.out.println("HNO       : " + HNO);
		System.out.println("colony    : " + colony);
		System.out.println("city      : " + city);
		System.out.println("state     : " + state);
	}

}
