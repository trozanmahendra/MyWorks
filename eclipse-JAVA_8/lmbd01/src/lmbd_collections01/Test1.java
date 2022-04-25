package lmbd_collections01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

class Mycomparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
//		if (o1 < o2) {
//			return 1;
//		} else if (o1 > o2) {
//			return -1;
//		} else {
//			return 0;
//		}
		return (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0; // Ternary operator powered here

	}

}

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(5);
		l.add(25);
		l.add(10);
		l.add(0);
		l.add(20);

		System.out.println("BEFORE SORTING : " + l);

		Collections.sort(l);

		System.out.println("AFTER NORMAL SORTING : " + l);

		Collections.sort(l, new Mycomparator());

		System.out.println("AFTER comaparator SORTING : " + l);

//		Comparator<Integer> x = (o1, o2) -> {return (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;};// Lambda Expression language powered here

		Collections.sort(l, (o1, o2) -> {return (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;});

		System.out.println("AFTER comaparator SORTING USED LAMDA-EXPRESSION : " + l);
		
		
		
	}

}
