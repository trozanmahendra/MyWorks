package test;

import beans.DEPARTMENT;
import beans.Employee;

public class Test {

	public static void main(String[] args) {
		Employee e1=new Employee("m-111","Mahendra",50000f,"KNL-002");
		Employee e2=new Employee("b-111","barath  ",5000f,"KNL-002");
		Employee e3=new Employee("s-111","surendra",500f,"KNL-002");

      Employee[] empss= {e1,e2,e3};		
        DEPARTMENT d=new DEPARTMENT("D-45-D","javamg",empss);
       
        d.getDepartmentdetails();
	}

}
