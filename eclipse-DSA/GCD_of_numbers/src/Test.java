
public class Test {

	public static void main(String[] args) {
		System.out.println(Test.gcd(7, 8));

	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}

		int c = a % b;
		a = b;
		return gcd(a, c);

//		return gcd(b, a % b);
	}
}
