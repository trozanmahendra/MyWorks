package flow_control;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("PALINDROME CHECK"+"\n---------------------------");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any String : ");
		String Str=sc.next(),reverseStr="";
		for(int i=Str.length()-1;i>=0;--i) {
			reverseStr=reverseStr+Str.charAt(i);
		}
		if(reverseStr.equals(Str)) {
			System.out.println(Str+" is a PALNDROME");
		}else {
			System.out.println(Str+" is not a PALINDROME");
		}
		sc.close();
		
	}

}
