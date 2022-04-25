package com.mgBusiness.beans;

import lombok.Data;

@Data
public class Branch {
	Student student;

	public Branch() {
		this.student=student;

	}
	public String getBranchName() {
		return "C.S.C";
	}
}
