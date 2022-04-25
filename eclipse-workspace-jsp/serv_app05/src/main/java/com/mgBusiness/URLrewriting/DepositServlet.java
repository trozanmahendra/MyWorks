package com.mgBusiness.URLrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import com.mgBusiness.TransactionService.TransactionService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			int depamt = Integer.parseInt(request.getParameter("depamt"));
			String depname = request.getParameter("depname");
			
			HttpSession httpSession = request.getSession(false);
			String accnum = (String) httpSession.getAttribute("accnum");
			String accname = (String) httpSession.getAttribute("accname");
			String acctype = (String) httpSession.getAttribute("acctype");
			String accbranch = (String) httpSession.getAttribute("accbranch");
			
			TransactionService txservice = new TransactionService();
			int totalAmt = txservice.deposit(accnum, depamt);
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style=\"color: rgb(245, 121, 0);\" align=\"center\">MG-BUSINESS</h1>");
			out.println("<h2 style=\"color: blue;\" align=\"center\">TRANSACTION DETAILS</h2>");
			out.println("<table align='center' border='1'bordercolor='red' bgcolor='lightgreen'>");
			out.println("<tr><td>ACCOUNT NUMBER</td><td>"+accnum+"</td></tr>");
			out.println("<tr><td>ACCOUNT HOLDER NAME</td><td>"+accname+"</td></tr>");
			out.println("<tr><td>ACCOUNT TYPE</td><td>"+acctype+"</td></tr>");
			out.println("<tr><td>ACCOUNT BRANCH</td><td>"+accbranch+"</td></tr>");
			out.println("<tr><td>TRANCTION TYPE</td><td>DEPOSIT</td></tr>");
			out.println("<tr><td>DEPOSIT AMOUNT</td><td>"+depamt+"</td></tr>");
			out.println("<tr><td>DEPOSITER NAME</td><td>"+depname+"</td></tr>");
			out.println("<tr><td>TOTAL BALANCE</td><td>"+totalAmt+"</td></tr>");
			out.println("<tr><td>TRANCTION STATUS</td><td>SUCCESS</td></tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			out.println("");
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
