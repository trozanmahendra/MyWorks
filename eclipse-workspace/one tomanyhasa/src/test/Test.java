package test;

import entities.Department;
import entities.Employee;

public class Test {
	public static void main(String[] mgh) {
		Employee e1=new Employee();
		e1.setEid("12we");
		e1.setEname("MAHENDRA");
		e1.setEsal(50000);
		e1.setEaddr("knl-002");
		
		Employee e2=new Employee();
		e2.setEid("12we");
		e2.setEname("brago   ");
		e2.setEsal(5000);
		e2.setEaddr("knl-002");
		
		Employee e3=new Employee();
		e3.setEid("12we");
		e3.setEname("surnNDRA");
		e3.setEsal(50);
		e3.setEaddr("knl-002");
		
		Employee[] emp= {e1,e2,e3};
		
		Department dept= new Department();
		dept.setDid("MG-123");
		dept.setDname("MG-JAVA");
		dept.setEmps(emp);
		dept.getDepartmentdetails();
		
}
}