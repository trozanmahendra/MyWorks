package constructor;
class A{
	public A() {
		System.out.println("I'm from class A()");
	}
}
class B extends A{
	public B() {
		System.out.println("class B()");
	}
}
public class Test extends B {
	public Test() {
		System.out.println("Test class");
	}

	public static void main(String[] args) {
		new Test();
		
		int n = 2147483647;
		int m= 5;
		int s = m+n;
		System.out.println(s);

	}

}
