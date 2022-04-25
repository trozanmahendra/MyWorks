package com.mgBusiness.I18N;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Demo {

	public static void main(String[] args) {
		Locale l = new Locale("en","US");
		NumberFormat nf = NumberFormat.getInstance(l);
		
		System.out.println(nf.format(1234564562.23653));
		System.out.println( NumberFormat.getInstance(new Locale("en","EN")).format(1235632.36936));
		
		DateFormat df = DateFormat.getDateInstance(0,l);
		
		System.out.println(df.format(new Date() ));
		System.out.println(DateFormat.getDateInstance(0,new Locale("LA")).format(new Date()));
		
		ResourceBundle rb = ResourceBundle.getBundle("abc",l);
		System.out.println(rb.getString("welcome"));
		
		ResourceBundle rb1 = ResourceBundle.getBundle("abc",new Locale("it","IT"));
		System.out.println(rb1.getString("welcome"));

	}

}
