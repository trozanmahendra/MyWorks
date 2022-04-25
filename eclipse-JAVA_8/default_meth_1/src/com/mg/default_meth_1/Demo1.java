package com.mg.default_meth_1;

interface intref {
	default int m1() {
		System.out.println("Default Method");
		return 0;
	}
}

public class Demo1 implements intref {
	public int m1() {
		System.out.println("My Implementation");
		return 0;
	}
	public static void main(String[] args) {
 
		int i = new Demo1().m1();
		System.out.println(i);
	}

}
