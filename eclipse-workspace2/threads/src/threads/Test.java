package threads;
class A{
	boolean flag=true;
	int count=0;
	public synchronized void cook() {
		try {
			for(int i=0;i<10;i++) {
					if (flag==true) {
					count++;
					System.out.println("...MOM COOKED CHICKENBIRYANI..."+count);
					flag=false;
					notify();
					wait();
					}else {
						wait();
					}
				}
		} catch (Exception e) {
		//e.printStackTrace();
			}
		}
	public synchronized void eat(){
		try {
			for(int i=0;i<10;i++) {
			if(flag==true) {
				wait();
			}else {
				
				System.out.println("...SON EATEN CHICKENBIRYANI..."+count);
					flag=true;
					notify();
					wait();
				}
				}
		} catch (Exception e) {
			//e.printStackTrace();
		}
		}
}
class mom extends Thread{
	A a;
	mom(A a){
		this.a=a;
	}
	public void run() {
		a.cook();
	}
	
}
class son extends Thread{
	A a;
	son(A a){
		this.a=a;
	}public void run() {
		a.eat();
	}
	
}
public class Test {

	public  static void main(String[] args)throws Exception
	{
		A a= new A();
		mom m= new mom(a);
		son s=new son(a);
		
		m.start();
		s.start();
		
		
	}
    
}
