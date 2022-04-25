package com.mgBusiness.beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
	Branch branch;
	public Student() {
		this.branch=branch;

	}
	public String getStudentName() {
		return "mg";
	}
}
