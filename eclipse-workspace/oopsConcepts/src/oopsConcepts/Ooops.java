package oopsConcepts;
class mg{
	static int i=10,i1=10;
	static int i2=2*(i+i1);
	int j=20;
	int p=i+j;
	String s="hi world";
	static char c='s';
	static String s1="HI JAVA";
}
class mg1 extends mg{
	int i1=6;
	static String s1=" I'M MAHENDRA ";
	}
class mg2 extends mg1{
	static int k=50;
	static String s2=", NEW DEVELOPER";
}
class mg3 extends mg2{
	
}
public class Ooops {
	
	static mg1 d=new mg1();
	public static void main(String[] args) {
		mg a=new mg();
		mg1 b=new mg1();
		mg2 c=new mg2();
		mg3 d=new mg3();
		System.out.println(mg.i+mg1.i+mg2.i);
        System.out.println(a.s);
        System.out.println(b.j+c.j+mg2.k);
        System.out.println(d.p);
        System.out.println(mg2.i2);
        System.out.println(""+mg.i2+mg.c+mg1.c+mg2.c+"  only concatenation here  ");
        System.out.println(mg2.k+b.i1);
        System.out.println(mg.s1+mg1.s1+mg2.s2);
        System.out.println(d.s+mg3.s1+mg3.s2);
	}
}
