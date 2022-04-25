package threads;
class god extends Thread{
	Object trust;
	Object show;
	god(Object trust,Object show){
		this.trust=trust;
		this.show=show;
	}
	public void run() {
		try {
			synchronized (trust){
				Thread.sleep(10);

				System.out.println("GOD SAYS TRUST ME I'LL SHOW YOU");
				synchronized (show) {
					

					System.out.println("god-man");	
			}
			
			}
		} catch (Exception e) {
			
		}
		
	}
}

class man extends Thread{
	Object trust;
	Object show;
	man(Object trust,Object show){
		this.trust=trust;
		this.show=show;
	}
	public void run() {
		try {
			synchronized (show) {
				//Thread.sleep(100);
			System.out.println("MAN SAYS SHOW ME I'LL TRUST YOU");
			synchronized (trust) {
				

				System.out.println("man-man");
			}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
public class Deadlock {
public static void main (String[] mg) {
	Object trust= new Object();
	Object show =new Object();
	
	god g= new god(trust, show);
	man m= new man(trust, show);
	
	g.start();
	m.start();
	
	
}
}
