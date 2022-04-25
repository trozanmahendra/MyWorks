package If_Condition;

public class If_Condition {

	public static void main(String[] args) {
		int a=1333,b=13,c=133;
		
		if (a>b) {
			if(a>c) {
				System.out.println("a is largest");
			}else {
				System.out.println("c is largest");
			}
		}else if(b>c) {
			if(b>a) {
				System.out.println("b is large");
			}else {
				System.out.println("a is large");
			}
		}else if(c>a) {
			if(c>b) {
				System.out.println("c is large");
			}else {
				System.out.println("b is large");
			}
		}else {
			System.out.println("all are equal");
		}
		
	}
}
