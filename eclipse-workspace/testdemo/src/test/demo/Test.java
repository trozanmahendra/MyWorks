package test.demo;
class A{
	int i=10,k=m1();
	static int j=12;
	A(int i) {
		System.out.println(i+"  "+j);
	}
	int m1() {
		System.out.println("m1--A");
		return 1;
	}
}
class B extends A{
	B()
	{
		super(1);
		System.out.println("B--con");
		int l1=super.m1();
		//super(1);
	}
	int l=this.m1();
	int m1() {
		System.out.println("m1--B");
		return 2;
	}
}
class C extends B{
	
	int l1=super.m1();
}
public class Test {
public static void main(String[] args) {
	C c= new C();
	C c1= new C();
}
}
