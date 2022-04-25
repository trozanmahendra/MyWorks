package test;

import java.util.*;
class A{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroyed.......");
	}
	@Override
	public String toString() {
		
		return "A";
	}
}
class Test {

	public static void main(String[] args) {
		A a=new A();
		/*HashMap<A,String> m= new HashMap<A,String>();
		m.put(a,"Mahendra");
		m.put(a,"Bharath");
		m.put(a,"Surendra");
		System.out.println(m);
		
		System.out.println(m);*/
		
		
		
		
		WeakHashMap<A,String> m1= new WeakHashMap<A,String>();
		m1.put(a,"Mahendra");
		m1.put(a,"Bharath");
		m1.put(a,"Surendra");
		System.out.println(m1);
		a=null;
		System.gc();
		
		System.out.println(m1);
		
		}}
