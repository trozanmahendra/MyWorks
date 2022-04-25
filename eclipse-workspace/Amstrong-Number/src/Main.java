import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			String n = sc.next();
			double n1 = Double.parseDouble(n);
			String c ="",c1="";
			double am = 0;
			for(int i=1; i<=n.length();i++) {
				
				c =c1+ n.charAt(i-1);
				am = am+Math.pow(Integer.parseInt(c), n.length());
			}
			if(n1==am) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
