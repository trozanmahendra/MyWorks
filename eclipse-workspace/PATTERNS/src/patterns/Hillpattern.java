package patterns;

public class Hillpattern {

	public static void main(String[] args) {
		int i=0,j=0,k=0;
        for(i=0;i<=10;i++) {
        	for(j=0;j<=i;j++) {
        		k++;
        		System.out.print(k+" \t");	
        	}
        	System.out.println("");
        }

	}

}
