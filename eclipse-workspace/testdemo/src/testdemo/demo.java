package testdemo;

import java.io.*;
public class demo {
public static void main(String[] args) throws Exception{
	File f = new File("/home/mg/Desktop/prac/abcdef/pnums.txt");
	PrintWriter pw= new PrintWriter(new FileWriter("/home/mg/Desktop/prac/abcdef/nodups.txt"));
	
	BufferedReader br=new BufferedReader(new FileReader(f));
	BufferedReader br1=new BufferedReader(new FileReader("/home/mg/Desktop/prac/abcdef/nodups.txt"));
	
	String nd = br1.readLine();
	String pn = br.readLine();
	while(pn!=null) {
		
		
       if(pn.equals(nd)) {
			while (nd!=null) {
				pw.println(pn);
		    	   pn= br.readLine();	
				
			}
			}
       
		
		
		
	}pw.flush();
	pw.close();
	br.close();
	
	}
     }
