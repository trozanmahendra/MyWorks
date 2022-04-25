package com.mgBusiness.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		 HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("uname",uname);
		 httpSession.setAttribute("upwd", upwd);
		 
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("form2.html");
		 requestDispatcher.forward(request, response);
	}

}
