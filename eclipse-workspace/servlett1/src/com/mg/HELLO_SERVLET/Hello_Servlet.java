package com.mg.HELLO_SERVLET;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@SuppressWarnings("serial")
public class Hello_Servlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		out.println("<html>");
		out.println("<h1 style='color:red;' align='center>"
				+ "HELLO----SERVLET</h1><body style='color:blue;' align='center>");
		out.println("Welcome to hello servlet</body></html>");
	}

}
