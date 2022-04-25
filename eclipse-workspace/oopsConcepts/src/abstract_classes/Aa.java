package abstract_classes;
abstract class a{
	void m1() {
		System.out.println("m1 abstract class demo");
		
	}
	abstract void m2();
	abstract void m3();
	void m4() {
		System.out.println("m4 inherited");
	}
	
	
}
class b extends a{
	void m2()
	{
		System.out.println("m2 inherited");
	}
	void m3()
	{
		System.out.println("m3 inherited");
	}
	
}
class c extends b{
	
}
public class Aa {

	public static void main(String[] args) {
		a s =new b();
		//a d=new a();
		//s.m2();
		//s.m3();
		//s.m1();
		
		b d=new b();
		//d.m1();
		//d.m2();
		//d.m3();
		
		c f=new c();
		//f.m1();
		//f.m2();
		f.m1();
		f.m2();
		f.m4();
		
	}

}
