package com.mgBusiness.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ValidationFilter implements Filter {


	public void destroy() {

	}

	public synchronized void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String uname = request.getParameter("uname");
			String upwd = request.getParameter("upwd");
			String uage = request.getParameter("uage");
			String umail = request.getParameter("umail");
			String umobile = request.getParameter("umobile");
			
//			int uagei = Integer.parseInt("uage");

			String uname_Error_message ="";
			String upwd_Error_message = "";
			String uage_Error_message = "";
			String umail_Error_message = "";
			String umobile_Error_message = "";

			boolean flag = true;

			if (uname == null || uname.equals("") || uname.length()<6 || !uname.startsWith("MG-")) {
				uname_Error_message = "USER-NAME OF ATLEAST 6 CHARACTERS IS REQURIED with 'MG-' AS PREFIX";
				flag = false;
			}
			if (upwd == null || upwd.equals("") || upwd.length()<6) {
				upwd_Error_message = "USER-PASSWORD IS REQURIED";
				flag = false;
			}
			if (uage == null || uage.equals("")) {
				uage_Error_message = "USER-AGE IS REQURIED ";
				flag = false;
			}else {
				int age = Integer.parseInt(uage);
				if(age<18 || age>50) {
					uage_Error_message = "USER-AGE IS REQURIED which should be in between 18 and 40";
					flag = false;
				}
			}
			if (umail == null || umail.equals("") || !umail.endsWith("@mg.com")) {
				umail_Error_message = "USER-MAIL IS REQURIED WITH '@mg.com' as suffix";
				flag = false;
			}
			if (umobile == null || umobile.equals("") || !umobile.startsWith("91-") || umobile.length() != 13 ) {
				umobile_Error_message = "USER-mobile-number IS REQURIED with '91-' as prefix and 10 digit number";
				flag = false;
			}
			if (flag == true) {
				chain.doFilter(request, response);
			}
			else {

			out.println("<html><body>");
			out.println("<h1 style=\"color: maroon;\" align=\"center\">MG-BUSINESS</h1>");
			out.println("<h2 style=\"color: blue;\" align=\"center\">USER REGISTRATION FORM</h2>");
			out.println("<form method='post' action='./reg'>");
			out.println("<table align=\"center\" bgcolor=\"cyan\" bordercolor=\"red\">");
			out.println("<tr><td>USER NAME</td><td><input type='text' name='uname' value='" + uname + "'></td>");
			out.println("<td><font color='red' size='5'>" + uname_Error_message + "</font></td></tr>");

			out.println("<tr><td>USER PASSWORD</td><td><input type='text' name='upwd' value='" + upwd + "'></td>");
			out.println("<td><font color='red' size='5'>" + upwd_Error_message + "</font></td></tr>");

			out.println("<tr><td>USER AGE</td><td><input type='text' name='uage' value='" + uage + "'></td>");
			out.println("<td><font color='red' size='5'>" + uage_Error_message + "</font></td></tr>");

			out.println("<tr><td>USER MAIL</td><td><input type='text' name='umail' value='" + umail + "'></td>");
			out.println("<td><font color='red' size='5'>" + umail_Error_message + "</font></td></tr>");

			out.println("<tr><td>USER MOBILE</td><td><input type='text' name='umobile' value='" + umobile + "'></td>");
			out.println("<td><font color='red' size='5'>" + umobile_Error_message + "</font></td></tr>");
			out.println("<tr><td><input type='submit' value='REGISTER'></td></tr>");
			out.println("</table></form></body></html>");
			
			out.println("");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
