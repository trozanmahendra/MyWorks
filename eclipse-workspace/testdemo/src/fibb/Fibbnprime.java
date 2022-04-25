package fibb;

import java.util.Scanner;

public class Fibbnprime {
	public static void main(String[] mhg) {
		Scanner s=new Scanner(System.in);
		
		long n1=0,nn=1,m=0,M=0;
		System.out.println("FINDING THE NEAREST POSSIBLE FIBANOCCI NUMBER(S) "+"\n------------------------------------------------");
		System.out.println("please enter the number and press enter");
		
		long i,n=s.nextInt();
		for(i=1;i<=n;i++) {
			m=n1+nn;
			n1=nn;
			nn=m;
			if(m<=n) {
				l1:for(int j=1;j<(m-m/2);) {
					j++;  long k=m%j;
					if(k==0) {   }else {System.out.print(" "+m);
					break;}
					}
				
				//break;
				}
		} 
		}		
}
