package com.qualification.check;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/chk")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html><body>");
	out.println("<h1 style='color: red' align='center' >QUALIFICATION CHECKING</h1>");
	String uqual = request.getParameter("uqual");
	if(uqual.equalsIgnoreCase("BSC")) {
		out.println("<h1 style='color: green' align='center'>You are eligible</h1>");
		out.println("<a href='./check.html'>|check again|</a>");
	}else {
		response.sendError(510, "YOU ARE NOT QUALIFIED ENOUGH TO GET THE F****............");
		
	}
	out.println("</html></body>");
		
	}

}
