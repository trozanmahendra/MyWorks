package com.mgBusiness.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uprof = request.getParameter("uprof");
		String uaddr = request.getParameter("uaddr");
		 HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("uprof",uprof);
		 httpSession.setAttribute("uaddr", uaddr);
		 
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("form3.html");
		 requestDispatcher.forward(request, response);
	}

}
