package streams_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(90);
		l.add(40);
		l.add(70);
		System.out.println(l);
		List<Integer> l1 = l.stream().filter(i -> i <= 40).map(i -> i * 2).collect(Collectors.toList());
		System.out.println(l1);
		List<Integer> l2 = l.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(l2);
		List<Integer> l3 = l.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		
		Integer[] a1 = l.stream().toArray(Integer[] :: new);
		
		System.out.println(a1);
		
		System.out.println("comp   ----------"+l3);
		System.out.println(l3.stream().map(i -> i * 2).collect(Collectors.toList()));
		System.out.println(l3.stream().count());
		
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,23,34,12,22,55,44,56);
		s1.forEach(i -> System.out.print(i+","));
//		System.out.println(s1.sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toUnmodifiableList()));
//		System.out.println();
//		s1.forEach(i -> System.out.println(i));

	}

}
