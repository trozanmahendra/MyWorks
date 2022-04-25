package com.mg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color: red;' align='center'>FIRST-SERVLET</h1><br><br><br> ");
		out.println("<h2><marquee>welcome to first servlet</marquee><br><br><br></h2>");
		
//		ServletContext sc = request.getServletContext();
		
		RequestDispatcher rd = request.getRequestDispatcher("/second");
		
//		RequestDispatcher rd = sc.getRequestDispatcher("/second");
//		RequestDispatcher rd = sc.getNamedDispatcher("Second");
		
		rd.include(request, response);
		
		
//		rd.forward(request, response);
		
		
		
	}

}
