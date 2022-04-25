package com.mgBusiness.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String umail = request.getParameter("umail");
		String umobile = request.getParameter("umobile");
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("umail", umail);
		httpSession.setAttribute("umobile", umobile);

		String uname = (String) httpSession.getAttribute("uname");
		String upwd = (String) httpSession.getAttribute("upwd");
		String uprof = (String) httpSession.getAttribute("uprof");
		String uaddr = (String) httpSession.getAttribute("uaddr");

		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:red;' align='center'>MG-BUSINESS</h1>");
		out.println("<h2 style='color:blue;' align='center'>USER DATA</h12>");
		out.println("<table  bgcolor ='lightyellow' align='center' border = '3'>");
		out.println("<tr><td>USER-NAME</td><td>" + uname + "</td></tr>");
		out.println("<tr><td>USER-PASSWORD</td><td>" + upwd + "</td></tr>");
		out.println("<tr><td>USER-PROFFESSION</td><td>" + uprof + "</td></tr>");
		out.println("<tr><td>USER-ADRESS</td><td>" + uaddr + "</td></tr>");
		out.println("<tr><td>USER-MAIL-ID</td><td>" + umail + "</td></tr>");
		out.println("<tr><td>USER-MOBILE-NO</td><td>" + umobile + "</td></tr>");
		out.println("</table>");
		out.println("</body");
		out.println("</html>");
	}

}
