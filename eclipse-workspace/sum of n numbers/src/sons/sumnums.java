package sons;
import java.util.Scanner;

public class sumnums {
public synchronized strictfp final
static void main(String... arg)
{
		Scanner sc=new Scanner(System.in);
		long x,s;
		System.out.println("give the number to get sum of the numbers up to that");
		x=sc.nextLong();
		s=x*(x+1)/2;
		System.out.println("the sum of the numbers is  \n"+s);
		}
}
