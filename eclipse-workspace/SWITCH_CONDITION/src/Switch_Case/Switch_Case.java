package Switch_Case;
import java.util.*;
public class Switch_Case {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("\tlets workout switch conditon \n"+"-------------------------------------------------------");
		System.out.println("ENTER ANY NUMBER FROM 5,10,15 ");
        int i=s.nextInt();
        switch(i) 
        {
        default:
        	System.out.println("THE ENTERED NUMBER "+i+" IS NOT FROM 5,10 & 15 ");
        	//break;
        case 5:
        	System.out.println("FIVE");
        //break;
        case 10:
        	System.out.println("ten");
        //break;
        case 15:
        	System.out.println("FIFTEEN");
        //break;
        case 20:
        	System.out.println("THE ENTERED NUMBER "+i+" IS NOT FROM 5,10 &15 u r a legend 20");
        }
        s.close();
	}

}
