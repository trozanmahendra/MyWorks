package collections_hashset;

import java.util.SortedMap;
import java.util.TreeMap;

public class HsahSet {

	public static void main(String[] args) {
		SortedMap<String, String> sm=new TreeMap<String,String>();
		sm.put("m", "mg");
		sm.put("b", "bg");
		sm.put("j", "jayamma");
		sm.put("l", "lakshmanna");
		System.out.println(sm);
		
		System.out.println(sm.headMap("l"));
		System.out.println(sm.tailMap("m"));
		System.out.println(sm.firstKey());
		System.out.println(sm.lastKey());
		System.out.println(sm.get("b"));
	    System.out.println(sm.subMap("j", "m"));
		
	}}


