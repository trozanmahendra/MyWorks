package deadlocking;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(50);
			System.out.println("Main method");

		}
		Thread t = new Thread();
		t.setPriority(10);
		ThreadA a = new ThreadA();
		Thread ta = new Thread(a);
		ThreadB b = new ThreadB();
		Thread tb = new Thread(b);

		ta.start();
		ta.setPriority(5);
//		ta.setDaemon(true);
		
		System.out.println(ta.getPriority());
		
		tb.start();
		tb.setPriority(5);
//		tb.setDaemon(true);
		
		
		
		
		
		

	}

}
