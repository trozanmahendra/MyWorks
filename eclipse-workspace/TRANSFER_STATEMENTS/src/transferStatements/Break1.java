package transferStatements;

public class Break1 {

	public static void main(String[] args) {
		System.out.println("\n\tUSING break TRANSFER STATEMENT IN NESTED LOOP\n"+"--------------------------------------------------------------");
		int i=0,j=0;
		for (i=0;i<=10;i++) {
			for (j=0; j<=10;j++) {
				if (j==9) {
					
					break;
					
				}
				System.out.println(i+" "+j);
			}
			
			
			
		}

	}

}
