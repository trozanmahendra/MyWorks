package com.mg;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String sname = request.getParameter("sname");
		String[] qual = request.getParameterValues("squal");
		String squal = "";
		for (String sq : qual) {
			squal = squal + sq + "<br>";
		}
		String sgender = request.getParameter("sgender");
		String[] courses = request.getParameterValues("scourses");
		String scourses = "";
		for (String cou : courses) {
			scourses = scourses + cou + "<br>";
		}
		String loc = request.getParameter("loc");
		String saddr = request.getParameter("saddr");

		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style = 'color:red;' align = 'center'>MG BUSINESS</h1>");
		out.println("<h2 style = 'color:blue;' align = 'center'>USER DETAILS</h2>");
		out.println("<table border ='1' align = 'center'>");
		out.println("<tr><td>STUDENT NAME</td><td>" + sname + "</td></tr>");
		out.println("<tr><td>STUDENT QUALIFICATIONS</td><td>" + squal + "</td></tr>");
		out.println("<tr><td>STUDENT GENDER</td><td>" + sgender + "</td></tr>");
		out.println("<tr><td>STUDENT COURSES</td><td>" + scourses + "</td></tr>");
		out.println("<tr><td>LOCATION</td><td>" + loc + "</td></tr>");
		out.println("<tr><td>STUDENT ADDRESS</td><td>" + saddr + "</td></tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

}
