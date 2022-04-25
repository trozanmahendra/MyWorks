import java.util.Scanner;
public class Fibanocci {
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
		if(m>n) {
			break;
			}
			}
	/*----------------------------------------------------------------------*/
	for(i=1;i<=n;i++) {
		M=n1+nn;
		n1=nn;
		nn=M;
		if(m<M) {
			break ;
			}
			}
	/*----------------------------------------------------------------------*/
	if (n==(M-m) || n==m) {
		System.out.println("Given number "+n+" itself is a FIBANOCCI NUMBER and the nearst fibanocci number is  : "+(2*m-M));
	}else if (n-(M-m)<m-n) {
		System.out.println("the nearst fibanocci number is --->  : "+(M-m));
	}else if (n-(M-m)==m-n){
		System.out.println("Both are equally nearer fibanocci numbers to the given number  "+n+"  ==>  : "+m+"  and "+(M-m));
	}else {
		System.out.println("the nearst fibanocci number is ==>>  : "+m);
	}
	}
}

