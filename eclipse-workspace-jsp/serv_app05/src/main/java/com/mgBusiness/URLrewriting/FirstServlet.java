package com.mgBusiness.URLrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String accnum = request.getParameter("accnum");
		String accname = request.getParameter("accname");
		
		
		HttpSession httpSession = request.getSession();
		
		httpSession.setAttribute("accnum", accnum);
		httpSession.setAttribute("accname", accname);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style=\"color: rgb(245, 121, 0);\" align=\"center\">MG-BUSINESS</h1>");
		out.println("<h2 style=\"color: blue;\" align=\"center\">ACCOUNT DETAILS</h2>");
//		out.println("<form method = 'post' action='"+response.encodeURL("./second")+"'>");
		out.println("<form method = 'post' action='./second;"+httpSession.getId()+"'>");
		out.println("<table align='center' bgcolor='lightpink'>");
		out.println("<tr><td>ACCOUNT TYPE</td><td><input type='text' name='acctype'></td></tr>");
		out.println("<tr><td>ACCOUNT BRANCH</td><td><input type='text' name='accbranch'></td></tr>");
		out.println("<tr><td> <input type = 'submit' value='NEXT'></td></tr>");
		
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
