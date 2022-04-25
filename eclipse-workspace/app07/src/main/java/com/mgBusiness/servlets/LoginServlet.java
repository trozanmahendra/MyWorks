package com.mgBusiness.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.mgBusiness.action.UserAction;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");

		UserAction useraction = new UserAction();
		String status = useraction.checkLogin(uname, upwd);

		out.println("<html>");
		out.println("<body bgcolor='cyan'> ");
		out.println("<br><br><br><br><br>");
		out.println("<h1 style='color: red;' align='center'>");
		if (status.equalsIgnoreCase("success")) {
			out.println("User Login Success");
		} else {
			out.println("User Login Failed");
		}
		out.println("</h1");
		out.println("</body");
		out.println("</html>");

	}

}
