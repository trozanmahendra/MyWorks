package com.mgBusiness.cookies;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");

		Cookie cookie1 = new Cookie("sid", sid);
		Cookie cookie2 = new Cookie("sname", sname);

		response.addCookie(cookie1);
		response.addCookie(cookie2);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("form2.html");
		requestDispatcher.forward(request, response);

	}

}
