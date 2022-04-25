package transferStatements;

public class ContinueStatement {

	public static void main(String[] args) {
		System.out.println("\n\tUSING continue TRANSFER STATEMENT\n"+"-------------------------------------------------------");
		int i=0;
		for (i=0;i<=19;i++) {
			if (i==9) {
				System.out.print(" __ ");
				continue;
				
			}
			System.out.print(i+" ");
			
		}

	}

}
