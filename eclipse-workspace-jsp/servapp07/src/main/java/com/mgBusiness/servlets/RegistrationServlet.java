package com.mgBusiness.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected synchronized void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String uname = request.getParameter("uname");
			String upwd = request.getParameter("upwd");
			int uage = Integer.parseInt(request.getParameter("uage"));
			String umail = request.getParameter("umail");
			String umobile = request.getParameter("umobile");
			
			out.println("<html><body>");
			out.println("<h1 style=\"color: maroon;\" align=\"center\">MG-BUSINESS</h1>");
			out.println("<h2 style=\"color: blue;\" align=\"center\">USER DETAILS</h2>");
			out.println("<table align=\"center\" bgcolor=\"lightyellow\" bordercolor=\"red\">");
			out.println("<tr><td>USER NAME</td><td>"+uname+"</td></tr>");
			out.println("<tr><td>USER PASSWORD</td><td>"+upwd+"</td></tr>");
			out.println("<tr><td>USER AGE</td><td>"+uage+"</td></tr>");
			out.println("<tr><td>USER MAIL</td><td>"+umail+"</td></tr>");
			out.println("<tr><td>USER MOBILE</td><td>"+umobile+"</td></tr>");
			out.println("</table></body></html>");
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
