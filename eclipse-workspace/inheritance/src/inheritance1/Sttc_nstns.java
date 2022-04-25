package inheritance1;

class A{
	
	A(){
		System.out.println("A-con");
	}
	static {
		System.out.println("SB-A");
	}
	{
		System.out.println("INB-A");
	}
	int i=m1();
	static int m1(){
		
		System.out.println("m1-A");
		return 54321;
	}
	}
class B extends A{
	
	B(){
		
		System.out.println("B-con");
	}
	{
		System.out.println("INB-B");
	}
	
	static {
		System.out.println("SB-B");
	}
	char j=m2();
    private char m2(){
			System.out.println("m2-B");
		return 1245;
	}
	}
class C extends B{
	C() {
        	System.out.println("i  =  "+i);
        	System.out.println("j  =  "+j);
                }
	}
public class Sttc_nstns {

	public static void main(String[] args) {
		
      
      System.out.println("-----------------------------------------------------");
      C c1= new C();
      System.out.println("-----------------------------------------------------");
      //c1.m2();
      A.m1();
      }

}
