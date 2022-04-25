package transferStatements;

public class Break {

	public static void main(String[] args) {
		System.out.println("\n\tUSING break TRANSFER STATEMENT\n"+"-------------------------------------------------------");
		int i=0;
		for (i=0;i<=19;i++) {
			if (i==9) {
				System.out.print("__ ");
				break;
				
			}
			System.out.print(i+" ");
			
		}
		
	}

}
