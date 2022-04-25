package sum_methods;
class A{
	void m1() {
		System.out.println("m1__method");
	}
	void m3() {
		System.out.println("m3__method");
	}
}
class B{
	void m2(X x) 
	{
		System.out.println("m2__method");
		x.m3();
	}
}
public class Meth1 {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		B b1=new B();
		B b2=new B();
		
		
	}

}
