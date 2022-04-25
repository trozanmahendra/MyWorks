package com.mgBusiness.handler;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class HelloHandler extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("<html><body>");
		out.println("<h1 style='color:red;'align='center'>");
		out.println("HELLO USER! DON'T BE A LOSER");
		out.println("</h1></body></html>");
		super.doTag();
	}

}
