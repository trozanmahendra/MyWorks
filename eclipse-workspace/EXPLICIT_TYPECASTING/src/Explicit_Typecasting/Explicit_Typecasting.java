package Explicit_Typecasting;
public class Explicit_Typecasting {
public static void main(String[] args) {
		System.out.println("\n \t THE EXPLICIT TYPECASTING EXAMPLES ARE BELOW \n"+"\t\t--------------------"
				+ "--------------------------------------");
		int i=2;
		byte b=(byte)i;
        System.out.println("given int--->i= "+i+"  converted to byte explicitly------>b= "+b);
        int j=2;
        byte c=3;
        byte d=(byte)(j+c);
        System.out.println("\ngiven int--->j= "+j+"  and byte--->c="+c+" result is converted to byte explicitly------>d=j+c===> "+d);
        byte p=79;
        short q=2;
        int r=3;
        long s=4;
        float t=5.1f;
        double u=6.11;
        char v=(char)(p+q+r+s+t+u);
        byte x=(byte)(p+q+r+s+t+u);
        short y=(short)(p+q+r+s+t+u);
        float z=(float)(p+q+r+s+t+u);
        System.out.println("\nthe results of all differerent data types is------>"+v+"-----"+x+"-----"+y+"-----"+z);
        int g=99;
        int h=88;
        byte n=(byte)(g+h);
        short a=(short)(g+h);
        System.out.println("\n special cases are -----"+n+"     "+a);
        System.out.println("\n----------The above ones are the typical examples of mixed data types typecasting explicitly---------");
	}

}
