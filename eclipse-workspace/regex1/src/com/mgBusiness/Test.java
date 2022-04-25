package com.mgBusiness;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	static int count;

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[\\s]D");
		Matcher m = p.matcher(
				"Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions Durga_SoftWare_Solutions ");

		while (m.find()) {
			count++;
			System.out.println(m.end() + "  " + m.start() + "  " + m.group() + "  ");
		}
		System.out.println(count);
	}

}
