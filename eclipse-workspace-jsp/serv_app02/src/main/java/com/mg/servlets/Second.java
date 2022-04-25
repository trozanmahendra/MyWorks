package com.mg.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
//		out.println("<html>");
//		out.println("<body>");
		out.println("<h1 style='color: maroon;' align='center'>SECOND-SERVLET</h1><br><br><br> ");
	
		out.println("<h2><marquee>welcome to second servlet</marquee><br><br><br></h2>");
		out.println("</body>");
		out.println("</html>");
		
//		RequestDispatcher rd = request.getRequestDispatcher("/first");
//		rd.include(request, response);
		
		
	}

}
