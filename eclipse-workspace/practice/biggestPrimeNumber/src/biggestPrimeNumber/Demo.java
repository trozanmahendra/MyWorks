package biggestPrimeNumber;

public class Demo {

	static boolean isPrime(double i) {
		boolean flag = true;
		for (double j = 2; j < i; j++) {
			if (i % j == 0) {
//				System.out.println("not prime  "+j);
				flag = false;
				break;
			}
		}
		return flag;
	}
		
		static boolean isPrimerev(double i) {
			boolean flag = true;
			for (double j = i-1; j >=2 ; j--) {
				if (i % j == 0) {
//					System.out.println("not prime  "+j);
					flag = false;
					break;
				}
			}
			return flag;
		

	}

	public static void main(String[] args) {
		new Demo();
		boolean b = Demo.isPrime(12345678912343d);
		System.out.println(b);
		double n = 67280421310721d;

//		for (double i = n; i >= 0; i--) {
//			if (isPrimerev(i)) {
//				System.out.print((long)i+", ");
//				break;
//			}
//		}

	}

}
