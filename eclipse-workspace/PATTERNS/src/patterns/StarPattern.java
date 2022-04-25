package patterns;

public class StarPattern {

	public static void main(String[] args) {
		System.out.println("\n\t numbers PATTERN\n"+"================================================");
        int i=0,j=0;
        for(i=1;i<=10;i++) {
        	for(j=1;j<=10;j++) {
        		
        		System.out.print((char)(64+j)+" ");	
        	}
        	System.out.println();
        }

	}

}
