import java.text.*;
import java.util.*;
class NumberFormatDemo 
{
	public static void main(String[] args)  throws ParseException
	{
		
	    NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(3);
		System.out.println(nf.format(123456.789));

	}
}
