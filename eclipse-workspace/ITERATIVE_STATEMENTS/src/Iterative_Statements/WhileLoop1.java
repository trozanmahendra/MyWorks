package iterative_Statements;

public class WhileLoop1 {

	public static void main(String[] args) {
		System.out.println("\tWHILE LOOP OPERATION\n"+"--------------------------------------------");
		System.out.println("\tTHE CAPITAL ALPHABET\n"+"--------------------------------------------");
		char i='A';
		char Z='Z';
		while (i<Z) {
			i++;
			System.out.print(i+" ");
		}
		System.out.println("\n\n\tTHE SMALL ALPHABET\n"+"--------------------------------------------");
		char a='a';
		char z='z';
		while (a<z) {
			a++;
			System.out.print(a +" ");
		}
		System.out.println("\n\n\tTHE INTEGERS \n"+"--------------------------------------------");
		int a1=0;
		int z1=40;
		while (a1<z1) {
			a1++;
			System.out.print(a1 +" ");
		}
	}

}
