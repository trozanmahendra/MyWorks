package com.qualification.check;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
//		response.setStatus(302);
		
//		response.setHeader("location", "http://localhost:8080/sev_app01/check.html");
		
		response.sendRedirect("http://localhost:8080/sev_app01/check.html");
	}

}
