package com.mg.serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String uname = request.getParameter("uname");
		String upwd = request.getParameter("pwd");

		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style = 'color : red;' align='center'>UDEMY ONLINE BUSINESS</h1>");
		out.println("<h2 style = 'color : blue;' align='center'>USER LOGIN STATUS</h1>");
		out.println("<br></br>");
		out.println("<h1 style = 'color : red;' align='center'>");
		if (uname.equalsIgnoreCase("mg") && upwd.equals("mgh123")) {
			out.println("LOGIN SUCCESSFUL");
		} else {
			out.println("WRONG LOGIN CREDENTIALS PLESE TRY AGAIN..........");
		}
		out.println("");
		out.println("</h1>");
		out.println("<h3 style = 'color : green;' align='center'>");
		out.println("<a href='./LoginForm.html'>|LoginForm|</a>");
		out.println("</h3>");
		out.println("</html>");
		out.println("</body>");
	}

}
