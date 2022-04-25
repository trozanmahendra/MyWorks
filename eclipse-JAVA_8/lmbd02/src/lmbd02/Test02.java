package lmbd02;

import java.util.TreeSet;

public class Test02 {

	public static void main(String[] args) {
//		Comparator<Integer> x =(p,q) -> {return (p<q)? 1:(p>q)? -1:0;};
		TreeSet<Integer> ts = new TreeSet<Integer>((p,q) -> {return (p<q)? 1:(p>q)? -1:0;});
		ts.add(0);
		ts.add(5);
		ts.add(3);
		ts.add(9);
		ts.add(8);
		System.out.println("EXPLICIT SORTING BY USING LAMBDA-EXPRESSION LANGUAGE  : "+ts);
		
		}

}
