package com.mgBusiness.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String smail = request.getParameter("smail");
		String smobile = request.getParameter("smobile");

		Cookie cookie5 = new Cookie("smail", smail);
		Cookie cookie6 = new Cookie("smobile", smobile);

		response.addCookie(cookie5);
		response.addCookie(cookie6);

		Cookie[] cookies = request.getCookies();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style = 'color : red;' align='center'>MG-BUSINESS</h1>");
		out.println("<h2 style = 'color : maroon;' align='center'>STUDENT-DATA</h2>");
		out.println("<table bgcolor = 'lightgreen' border ='2' align='center'");
		for (Cookie c : cookies) {
			out.println("<tr><td>" + c.getName() + "</td><td>" + c.getValue() + "</td>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

}
