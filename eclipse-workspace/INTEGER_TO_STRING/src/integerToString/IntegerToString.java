package integerToString;
import java.util.*;
public class IntegerToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\tnum to word conversion\n"+"-----------------------------------");
        System.out.println("PLEASE ENTER THE INTEGER TO CONVERT IN TO WORD FORMAT BELOW");
        int i=sc.nextInt();
        switch (i)
        {
        case 1:
        	System.out.println("one");
        break;
        case 2:
        	System.out.println("two");
        break;
        case 3:
        	System.out.println("three");
        break;
        case 4:
        	System.out.println("four");
        break;
        case 5:
        	System.out.println("five");
        break;
       
        case 6:
        	System.out.println("six");
        break;
        case 7:
        	System.out.println("seven");
        break;
        case 8:
        	System.out.println("eight");
        break;
        case 9:
        	System.out.println("nine");
        break;
        
        default:
        System.out.println("GIVEN NUMBER SHOULD BE IN BETWEEN 1 AND 9 ONLY IT IS LIMITED");
        
        	
        }   
	}

}
