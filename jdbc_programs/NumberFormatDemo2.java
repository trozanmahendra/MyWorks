import java.text.*;
import java.util.*;
class NumberFormatDemo2 
{
	public static void main(String[] args)  
	{
	    double d = 123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Italy Form is...:"+nf.format(d));			
 	}
}
Italy Form is...:123.456,789