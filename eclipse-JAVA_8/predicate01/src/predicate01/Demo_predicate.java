package predicate01;

import java.util.function.Predicate;

public class Demo_predicate {

	public static void main(String[] args) {
		Predicate<String> p = s -> s.equals("Mahendra");
		
		System.out.println(p.test("Mahendra") );
		
		
		

	}

}
