package lmbd_user_defined_object_genric03;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	
	public int eno;
	public String ename;
	public Employee( int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}
	@Override
	public String toString() {
		
		return eno+ " : "+ename ;
	}
	
}

public class Test3 {
	
	
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee(200, "Bharath"));
		l.add(new Employee(300, "SURENDRA"));
		l.add(new Employee(100, "Lakshmanna"));
		l.add(new Employee(400, "Mahendra"));
		l.add(new Employee(500, "JAYAMMA"));
		
		System.out.println("BEFORE SORTING :  \n                 "+l);
		
//		Comparator<Employee> c = (Employee e1 ,Employee e2) -> {return (e1.eno<e2.eno)? 1: (e1.eno>e2.eno)? -1:0;};
		
		Collections.sort(l,(e1 , e2) -> {return (e1.eno<e2.eno)? 1: (e1.eno>e2.eno)? -1:0;});
		
		System.out.println("AFTER SORTING : \n                 "+l);

	}

}
