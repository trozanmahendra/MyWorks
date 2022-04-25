package com.mgBusiness.factory;

import com.mgbusiness.act.StudentAction;

public class StudentActionFactory {
private static StudentAction studentAction = null;

static {
	 studentAction  = new StudentAction();
}
public static StudentAction getStudentAction() {
	return studentAction;
	
}

}
