package ternery;

public class Ternery_oprtr {
	public static void main(String[] args) {
		System.out.println("TERNERY OPERATIONS ARE BELOW \n"+"------------------------------");
		int a=10;
		int b=5;
		System.out.println("The given values are  "+a+" and "+b +"\n\nfinding the min and max values \n");
		int min=a>b? b:a;
		System.out.println("The min value is"+min);
		int max=a>b? a:b;
		System.out.println("\nThe max value is"+max);
		System.out.println("\n\nThe min value is"+(a>b? b:a));
		System.out.println("The max value is"+(a<b? b:a));
	}

}
