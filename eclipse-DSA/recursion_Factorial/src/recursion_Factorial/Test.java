package recursion_Factorial;

public class Test {
	static int fact(int n) {
		if (n < 0)
			return -1;
		if (n == 0)
			return 1;
		else if (n == 1) {
			return n;
		} else {
			return n * fact(n - 1);
		}

	}

	public static void main(String[] args) {
		System.out.println(Test.fact(-10));
		
		System.out.println();

	}

}
