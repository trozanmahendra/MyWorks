package Bool_logic_opt;
import java.util.*;
public class primenumber {
public static void main(String[] Mahendra) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any number to check whether it is PRIME or not");
	long i= s.nextLong();
	long j,k;
	if (i<1) {
		System.out.println(i+" is not VALID number please enter the POSITIVE INTEGERS only  ");
	}else if(i==1){
		System.out.println(i+" is not PRIME by defination");
	}else {
	l1:for(j=1;j<(i-i/2);) {
		j++;  k=i%j;
		if(k==0) {
			System.out.println("NOT A PRIME NUMBER remainder is  "+k+", given number,"+i+" divisible by "+j);
			System.exit(0);
			break l1;
			}else {}
		}System.out.println("A PRIME NUMBER");
	}
}
}