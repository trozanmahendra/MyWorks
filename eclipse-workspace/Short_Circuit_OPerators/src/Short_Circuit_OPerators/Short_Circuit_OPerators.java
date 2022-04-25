package Short_Circuit_OPerators;

public class Short_Circuit_OPerators {

	public static void main(String[] args) {
		System.out.println("SHOTCIRCUT OPERATIONS ARE BLEOW \n"+"--------------------------------");
		int a=10,b=10;
		if(a++==10 | b++ ==10);
		System.out.println(a+"   "+b+"   single | operation");
		
		int c=10,d=10;
		if(c++==10 || d++ ==10);
		System.out.println(c+"   "+d+"   double || operation\n");
		
		int e=10,f=10;
		if(e++!=10 & f++ ==10);
		System.out.println(e+"   "+f+"   single & operation");
		
		int g=10,h=10;
		if(g++!=10 && h++ ==10);
		System.out.println(g+"   "+h+"   double && operation");
	}

}
