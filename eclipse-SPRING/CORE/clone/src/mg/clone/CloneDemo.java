package mg.clone;

class A implements Cloneable {
	private int i;
	private String s;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public A() {

		System.out.println("Object cloning Costructer \n");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		A classA = new A();                                         //Deep Cloning
		return classA;

//		return super.clone();                                       //Shallow cloning
	}
}

public class CloneDemo {

	public static void main(String[] args) {
		A a = new A();

		a.setI(1);
		a.setS("Mahendra");

		System.out.println("i : " + a.getI() + ",<--------> s : " + a.getS() + "\n");

//		A a1 = new A();

		try {
			A cloneA = (A) a.clone();
			cloneA.setI(11);
			cloneA.setS("MAhendra Goud");
			System.out.println("Clone i : " + cloneA.getI() + ",<--------> Clone s : " + cloneA.getS());

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}

	}

}
