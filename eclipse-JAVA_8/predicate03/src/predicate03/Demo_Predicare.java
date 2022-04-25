package predicate03;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo_Predicare {

	public static void main(String[] args) {
		String[] s = {"Mahendra","Bharth","Surendra","Murali","Mahesh","Manoj","Mahek","Jayamma","",null,null};
		
		Predicate<String> startsWithM = s1 -> s1!=null && s1.startsWith("M");
		
		ArrayList<String> Mnames =new ArrayList<String>();
		
		ArrayList<String> noMnames  = new ArrayList<String>();
		for(String s1 :s) {
			if(startsWithM.test(s1)) {
				Mnames.add(s1);
			}else {
				noMnames.add(s1);
			}
		}
		System.out.println(Mnames);
		
//		System.out.println(noMnames);
		
		Predicate<String> Nonulls = s2 -> s2!=null && s2.length()!=0;
		ArrayList<String> noMnames2  = new ArrayList<String>();
		
		for(String s2 :noMnames) {
			if(Nonulls.test(s2)) {
				noMnames2.add(s2);
			}
		}
		System.out.println(noMnames2);
	}

}
