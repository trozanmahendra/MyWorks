class OperatorDemo 
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		a = b=c=d=20;
		c -= a += b -= d  *= 4;
		
		System.out.println(a +"..." + b +".." + c +".."+d );
	}
}
