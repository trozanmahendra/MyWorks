package var_arg_method;
class A{
	public void m1(int... a) {
		System.out.println("\nVAR-ARG METHOD length    :  "+a.length);
		System.out.println();

		System.out.print("argument list     "+"       :  ");
		
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum=sum+a[i];
			}
		System.out.println();
		System.out.println("\nsum of arguments         :  "+sum);
		System.out.println("\n---------------------------------------------------");
	}
	
}

public class Var_Arg_Meth {

	public static void main(String[] args) {
		A a=new A();
		
		a.m1(0);
		a.m1(10,20,30,40,50,60);
		a.m1(1);
		a.m1(1,2);
		a.m1(1,2,2,2,2,2,2,2);
		

	}

}
