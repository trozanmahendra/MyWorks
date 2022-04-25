package patterns;

public class UpsideDown_Pyramid {
	public static void main(String...strings)
	{
		for (int i=0;i<=10;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=10;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
				}
		System.out.println("odd case");
		for (int i=0;i<=20;i=i+2) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=20;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
				}
		System.out.println("even case");
		for (int i=0;i<=20;i=i+2) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=20;j>=i-1;j--) {
				System.out.print("* ");
			}
			System.out.println();
				}
	}
}
