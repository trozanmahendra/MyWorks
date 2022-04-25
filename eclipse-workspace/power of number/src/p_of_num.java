import java.util.Scanner;
//import java.util.^;
public class p_of_num {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the base number \n ");
		double b,p;
		b=sc.nextDouble();
		System.out.print("enter the power number \n ");
		Scanner sc1=new Scanner(System.in);
		p=sc.nextDouble();
		double val=Math.pow(b,p);
		System.out.print("the answer is... \n "+val);
		}
}
