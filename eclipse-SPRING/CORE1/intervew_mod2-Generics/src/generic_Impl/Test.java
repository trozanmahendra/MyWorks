package generic_Impl;

import java.util.ArrayList;
import java.util.List;

class Employee{
	public Employee() {
		System.out.println("Employee Object");
	}
	
	@Override
	public String toString() {
		
//		return super.toString();
		return "Employee Object";
	}
}

public class Test {

	public static void main(String[] args) {

//		                                             Arraylist Without generics  

		List list = new ArrayList();
		list.add(123);                                 // int
		list.add("Mahendra");                          // String
		list.add(true);                                // boolean
		list.add(12.23f);                              // float
		list.add(12.98768987905);                      // double
		list.add((char) 97);                           // char with typecasting
		list.add('b');                                 // char
		list.add(new Employee());                      // Employee Object

		System.out.println("Arraylist Without generics is  " + list);
		System.out.println();
//		                                             Arraylist With generics

		List<String> list1 = new ArrayList<String>();

		list1.add("This");
		list1.add("is");
		list1.add("an example");
		list1.add("of");
		list1.add("Generic implementation");

		System.out.println("Arraylist With generics is  " + list1);

	}

}
