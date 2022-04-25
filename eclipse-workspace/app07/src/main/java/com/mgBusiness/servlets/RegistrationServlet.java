package com.mgBusiness.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.mgBusiness.action.UserAction;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		String umail = request.getParameter("umail");
		String umobile = request.getParameter("umobile");

		UserAction useraction = new UserAction();

		String status = useraction.registration(uname, upwd, umail, umobile);

		out.println("<html>");
		out.println("<body bgcolor='cyan'>");
		out.println("<h1 style = 'color:red' align='center'>");
		out.println("<br><br><br>");
		if (status.equalsIgnoreCase("existing")) {
			out.println("user is EXISTING");
		}
		if (status.equalsIgnoreCase("success")) {
			out.println("User registred successfully");
		}
		if (status.equalsIgnoreCase("failure")) {
			out.println("User Registrtion failed...please try again");
		}
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");

	}

}
