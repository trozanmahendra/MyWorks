package iterative_Statements;

public class forloop3 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,12,23,4,5};
		System.out.println("\nforloop is below"+"\n-----------------------------------");
		for(int i=6;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\nfor-Each loop is below"+"\n-----------------------------------");
		for(int x : a) 
		{
			System.out.print(x+" ");
		}
	}

}
