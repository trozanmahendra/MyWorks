package com.mg.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet({ "/ReqHeaders","loadOnStartup=1"})
public class ReqHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Enumeration<String> headerNames = request.getHeaderNames();
		out.println("<html><body>");
		out.println("<h2 style = 'Color:red;' align = 'center'>Request Headers</h2>");
		
		
		out.println("<table border = '20' align = 'center'>");
		out.println("<tr><th align = 'center'>Header Name</th><th align = 'center'>Header Value</th></tr>");
		while(headerNames.hasMoreElements()) {
			out.println("<tr>");
			out.println("<td>"+headerNames.nextElement()+"</td>");
			out.println("<td>"+request.getHeader(headerNames.nextElement())+"</td>");
			out.println("</tr>");
			
		}
		out.println("</table></body></html>");
	}

}
