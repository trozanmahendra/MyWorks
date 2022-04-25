package palindrome;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = "";
		
		if(s1.contentEquals((new StringBuffer(s1)).reverse()))
			System.out.println("paindrome------------");
		else {
			System.out.println("Nope++++++++++++++++++++++++++++");
		}
		/////////////////////////////////////////////

		for (int i = 1; i <= s1.length(); i++) {
			s2 +=  s1.charAt(s1.length() - i);
		}
		
		
		
		System.out.println(s1 + " " + s2);
		if (s1.equals(s2))
			System.out.println("Yup palindrome");
		else {
			System.out.println("Nope---------");
		}

		try {
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			if (n2 == n1)
				System.out.println("palindrome number");
			else {
				System.out.println("Nope");
			}
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}
	}

}
