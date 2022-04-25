package predicate_2;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = n -> (n<10);
		Predicate<Integer> p2 = n -> (n%2) == 0;
		
		System.out.println("checking number is less than 10 or not");
		
		boolean t1 = p1.test(12);
		boolean t2 = p1.test(2);
		
		System.out.println(t1+"  "+t2);
		
		System.out.println("checking number is even or not");
		
		boolean t3 = p2.test(12);
		System.out.println(t3);
		
		System.out.println("checking the p1 negation");
		
		boolean t4 = p1.negate().test(13);
		
		System.out.println(t4);
		
		System.out.println("checking p2 negation");
		
		boolean t5 = p2.negate().test(3);
		
		System.out.println(t5);
		
		System.out.println("checking both p1 and p2");
		
		boolean t6 = p1.and(p2).test(11);
		boolean t7 = p1.and(p2).test(4);
		
		System.out.println(t6+"  "+t7);
		
		System.out.println("checking both negation");
		
		boolean t8 = p1.and(p2).negate().test(3);
		
		System.out.println(t8);
		
		System.out.println("checking both with or");
		
		
		boolean t9 = p1.or(p2).test(5);
		
		boolean t10 = p1.or(p2).negate().test(6);
		System.out.println(t9+"  "+t10);
		
		

	}

}
