package patterns;

public class Odd_Pattern {

	public static void main(String[] args) {
		int i=0,j=0,k=0,l=0;
		for(i=1;i<=10;i=i+2) {
			for(j=1;j<=10-i;j++) {
				System.out.print("  ");
			}for(k=1;k<=i;k++) 
			{
				l++;
				System.out.print("*   ");
			}System.out.println();
		}


	}

}
