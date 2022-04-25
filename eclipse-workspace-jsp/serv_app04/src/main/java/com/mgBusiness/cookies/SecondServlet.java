package com.mgBusiness.cookies;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sdob = request.getParameter("sdob");
		String squal = request.getParameter("squal");

		Cookie cookie3 = new Cookie("sdob", sdob);
		Cookie cookie4 = new Cookie("squal", squal);

		response.addCookie(cookie3);
		response.addCookie(cookie4);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("form3.html");
		requestDispatcher.forward(request, response);

	}

}
