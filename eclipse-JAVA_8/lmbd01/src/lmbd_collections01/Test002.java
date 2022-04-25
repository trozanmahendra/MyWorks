package lmbd_collections01;

import java.util.TreeMap;

public class Test002 {

	public static void main(String[] args) {
		TreeMap<Integer, String> m = new TreeMap<Integer, String>( (r,s) -> {return(r>s)? -1:(r<s)? 1:0;});
		
		// used lamda-expression above
		
		m.put(9, "MG");
		m.put(2, "bg");
		m.put(6, "sg");
		m.put(3, "lg");
		m.put(8, "jg");
		
		System.out.println(" EXPLICITLY SORTED USING COMPARATOR THROUGH LAMBA-EXPRESSION : "+m);

	}

}
