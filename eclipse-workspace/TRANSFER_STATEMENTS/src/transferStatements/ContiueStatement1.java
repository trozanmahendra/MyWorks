package transferStatements;

public class ContiueStatement1 {
	public static void main(String...strings) {
		System.out.println("\n\tUSING continue TRANSFER STATEMENT IN NESTED LOOP\n"+"--------------------------------------------------------------");
		int i=0,j=0;
		l:for (i=0;i<=10;i++) {
			for (j=0; j<=12;j++) {
				if (j==6) {
					
					continue l;//l1 is labelled  to break the labelled loop in line-8
					
				}
				System.out.println(i+" "+j);
			}
			
			
			
		}
		
	}

}
