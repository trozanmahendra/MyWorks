package patterns;
import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("\n\t numbers PATTERN\n"+"=======================================================================================");
        int i=0,j=0,k=0;
        System.out.println("enter the number of rows");
        int l=s1.nextInt();
        System.out.println("enter the number of coloumns");
        int m=s2.nextInt();
        for(i=0;i<l;i++) {
        	for(j=0;j<m;j++) {
        		k++;
        		System.out.print(k+"\t");	
        	}
        	System.out.println();
        }
	}

}
