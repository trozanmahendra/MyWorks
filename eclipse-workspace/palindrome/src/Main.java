import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			String sr = "";
			for (int i = 1; i <= s.length(); i++) {
				sr = sr + s.charAt((s.length()) - i);
			}

			if (s.equals(sr)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
