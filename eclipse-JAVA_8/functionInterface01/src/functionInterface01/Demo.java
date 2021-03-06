package functionInterface01;

import java.util.function.Function;

public class Demo {
	Boolean bb;

	static int powOfNum(Integer i1, Integer power) {

		Function<Integer, Integer> f = i -> {
			int pow = power;
			int num = 1;
			for (int j = 0; j < pow; j++) {
				num *= i;
			}
			return num;
		};
		return f.apply(i1);
	}

	public static void main(String[] args) {
//		Function<Integer, Integer> f = (i) -> {
//			int pow = 3;
//			int num = 1;
//			for (int j = 0; j < pow; j++) {num *= i;}return num;};
		System.out.println(Demo.powOfNum(10, 2));
		
		Boolean b1 = new Boolean(null);
		Boolean b2 = new Boolean(false);
		System.out.print((b1 == b2)+" ");
		System.out.print(b1.equals(b2));
		System.out.println(new Demo().bb);

		
	}

}
