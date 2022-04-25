package com.mgBusiness.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException  {
		response.setContentType(null);
		PrintWriter out = response.getWriter();

		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		String uqual = request.getParameter("uqual");
		String umail = request.getParameter("umail");
		String umobile = request.getParameter("umobile");

		out.println("<html><body>");
		out.println("<h1 style='color:red;' align='center'>MG-BUSINESS</h1>");
		out.println("<h2 style='color:blue;' align='center'>REGISTRATION FORM</h2>");
		out.println("<table align='center' bgcolor='yellow'>");
		out.println("<tr><td>USER NAME</td><td>" + uname + "</td></tr>");
		out.println("<tr><td>USER PASSWORD</td><td>" + upwd + "</td></tr>");
		out.println("<tr><td>USER QUALIFICATION</td><td>" + uqual + "</td></tr>");
		out.println("<tr><td>USER MAIL</td><td>" + umail + "</td></tr>");
		out.println("<tr><td>USER MOBILE</td><td>" + umobile + "</td></tr>");
		out.println("</table></body></html>");

	}

}
