package deadlocking;

public class ThreadA extends Thread {
	public ThreadA() throws InterruptedException {
		m1();
	}
	
	@Override
	public void run() {
		super.run();
	}

	public  void m1() throws InterruptedException {
//		new ThreadB().m2();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(50);
			System.out.println("M11111111111 method");

		}

	}
}
