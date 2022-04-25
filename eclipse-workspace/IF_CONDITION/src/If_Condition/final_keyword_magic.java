package If_Condition;

public class final_keyword_magic {

	public static void main(String[] args) {
		System.out.println("\tunderstanding the usage of (final) keyword \n"+"---------------------------------------------------------------");
        final int i=9;
      //if we do not use final keyword below if conditon cant be compiled by compiler lead to error asking to give the value for j
        int j;
        if (i==8) {
        	j=20;
        }else {
        	j=30;
        	System.out.println(i+"    "+j);
        }
	}

}
