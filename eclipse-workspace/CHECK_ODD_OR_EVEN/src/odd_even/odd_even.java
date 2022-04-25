package odd_even;
import java.util.Scanner;
public class odd_even {

	public static void main(String[] args) {
		System.out.println("finding given number is odd or even\n");
		Scanner c=new Scanner(System.in);
		System.out.println("enter any number to check it is add or even");
		int a=c.nextInt();
		if(a%2==0) {
			System.out.print("--------->even");
		}else {
			System.out.print("--------->odd");
		}
		
		

	}

}
