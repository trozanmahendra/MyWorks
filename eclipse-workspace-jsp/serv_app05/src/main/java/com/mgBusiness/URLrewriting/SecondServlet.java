package com.mgBusiness.URLrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String acctype = request.getParameter("acctype");
		String accbranch = request.getParameter("accbranch");
		
		
		HttpSession httpSession = request.getSession(false);
		
		httpSession.setAttribute("acctype", acctype);
		httpSession.setAttribute("accbranch", accbranch);
		
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style=\"color: rgb(245, 121, 0);\" align=\"center\">MG-BUSINESS</h1>");
		out.println("<h2 style=\"color: blue;\" align=\"center\">ACCOUNT DETAILS</h2>");
		out.println("<form method = 'post' action='"+response.encodeURL("./deposit")+"'>");
//		out.println("<form method = 'post' action='./deposit;JSESSIONID ="+httpSession.getId()+"'>");
		out.println("<table align='center' bgcolor='lightpink'>");
		out.println("<tr><td>DEPOSIT AMOUNT</td><td><input type='text' name='depamt'></td></tr>");
		out.println("<tr><td>DEPOSITER NAME</td><td><input type='text' name='depname'></td></tr>");
		out.println("<tr><td> <input type = 'submit' value='DEPOSIT'></td></tr>");
		
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
