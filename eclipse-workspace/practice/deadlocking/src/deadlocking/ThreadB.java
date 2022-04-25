package deadlocking;

public class ThreadB extends Thread {
	public ThreadB() throws InterruptedException {
		m2();
	}
	@Override
	public void run() {
		super.run();
	}

	public  void m2() throws InterruptedException {
//		new ThreadA().m1();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(50);
			System.out.println("M222222222222 method");

		}
	}
}
