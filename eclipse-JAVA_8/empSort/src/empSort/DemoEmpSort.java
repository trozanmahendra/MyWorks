package empSort;

import java.util.ArrayList;
import java.util.function.Predicate;

class Emp {
	String ename;
	float esal;
	String eaddr;

	public Emp(String ename, float esal, String eaddr) {
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
	}

	@Override
	public String toString() {

		return String.format("{%s ,%.02f ,%s}", ename, esal, eaddr);
	}
}

public class DemoEmpSort {

	public static void main(String[] args) {
		System.out.println(new Emp("Mg", 230000, "KNL"));

		ArrayList<Emp> l = new ArrayList<Emp>();
		l.add(new Emp("mahendra", 100, "knl"));
		l.add(new Emp("madhu", 200, "knl"));
		l.add(new Emp("santosh", 300, "knl"));
		l.add(new Emp("manoj", 400, "nellore"));
		l.add(new Emp("prashanth", 500, "Hyd"));
		System.out.println(l);

		Predicate<Emp> p1 = e -> (e.eaddr).equalsIgnoreCase("knl");
		Predicate<Emp> p2 = e1 -> (e1.esal) < 400;
		ArrayList<Emp> s4 = new ArrayList<Emp>();
		ArrayList<Emp> k = new ArrayList<Emp>();
		ArrayList<Emp> nonK = new ArrayList<Emp>();

		for (Emp e : l) {
			if (p1.test(e)) {
				k.add(e);
			} else {
				nonK.add(e);

			}
		}
		for (Emp e1 : l) {
			if (p2.test(e1)) {
				s4.add(e1);
			}
		}
		System.out.println(k);
		System.out.println(nonK);
		System.out.println(s4);

	}

	public void display(Predicate<Emp> p1, ArrayList<Emp> l) {

	}

}
