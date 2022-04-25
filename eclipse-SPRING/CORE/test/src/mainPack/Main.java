package mainPack;

import p1.Emp1;

public class Main {

	public static void main(String[] args) {
		
		Emp1 e1 = new Emp1();
		System.out.println(e1.ID+"  "+e1.name);
//		System.out.println(e1.getID()+"  "+e1.getName());
		e1.setID("123");
		e1.setName("sssaaa");
		System.out.println(e1.getID()+"  "+e1.getName());
//		System.out.println(e1.name+"  "+e1.ID);
////		e1.ID="1111";
////		e1.name="aaa";
//		System.out.println(e1.name+"  "+e1.ID);

	}

}
