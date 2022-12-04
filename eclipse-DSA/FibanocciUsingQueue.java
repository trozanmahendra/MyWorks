package fibanocciUsingQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class FibanocciUsingQueue {
	
	public static void main(String[] mg) {
		Queue<Integer> integers = new PriorityQueue<>();
		integers.offer(0);
		integers.offer(1);
		
		for(int i=0;i<10;i++) {
			int a = integers.poll();
			int b = integers.poll();
			integers.offer(b);
			integers.offer(b+a);
			System.out.print(a+" ");
//			System.out.println(integers);
		}
		System.out.println(integers);
	}
}
