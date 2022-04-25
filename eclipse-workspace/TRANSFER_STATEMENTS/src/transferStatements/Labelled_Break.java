package transferStatements;

public class Labelled_Break {

	public static void main(String[] args) {
		System.out.println("\n\tUSING break TRANSFER STATEMENT IN NESTED LOOP\n"+"--------------------------------------------------------------");
		int i=0,j=0;
		l1:for (i=0;i<=10;i++) {
			for (j=0; j<=10;j++) {
				if (j==9) {
					
					break l1;//l1 is labelled break to break the labelled loop in line-8
					
				}
				System.out.println(i+" "+j);
			}
			
			
			
		}


	}

}
