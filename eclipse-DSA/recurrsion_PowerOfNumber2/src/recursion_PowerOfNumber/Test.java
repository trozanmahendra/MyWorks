package recursion_PowerOfNumber;

public class Test {

	static double powOfNum(double n, int p) {
		if(p<0) {
			n=1/n;
			p=-1*p;
			return n = powOfNum(n, p);
		}

		if (p == 0) {
			return 1;
		}
//			else if (p == 1) {
//			return n;
//		}
		else {
//			p--;
			return n = n * powOfNum(n, p - 1); // Recursion
		}

	}

	public static void main(String[] args) {

		System.out.println(Test.powOfNum(2, -2));

		int N = 2;
		int P = 3;
		int i = 1;
		int M = 1;
		for (i = 1; i <= P; i++) {
			M *= N;
		}
		System.out.println(M);

		System.out.println(Math.pow(0.2, -0.3));

	}

}
