package com.mgBusiness.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.mgBusiness.Student;
import com.mgBusiness.factory.StudentActionFactory;
import com.mgbusiness.act.StudentAction;

@WebServlet("/editform")
public class EditFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sid = request.getParameter("sid");
		StudentAction studentaction = StudentActionFactory.getStudentAction();
		Student student = studentaction.getStudent(sid);
		
		out.println("<html>");
		out.println("<body>");
		
		if(student == null) {
			out.println("<h1 style='color: red' align = 'center'>");
			out.println("MG-BUSINESS");
			out.println("</h1>");
			
			out.println("<h2 style='color:blue;' align='center'>");
			out.println("Student Edit Form");
			out.println("</h2>");
			out.println("<h1 style='color: red' align = 'center'>");
			out.println("Student is'nt existing");
			out.println("</h1>");
			out.println("<h3 align = 'center'>");
			out.println("<a href='./updateform.html'>updateForm</a>");
			out.println("</h3>");
			
		}else {
			out.println("<h1 style='color: red' align = 'center'>");
			out.println("MG-BUSINESS");
			out.println("</h1>");
			
			out.println("<h2 style='color:blue;' align='center'>");
			out.println("Student Edit Form");
			out.println("</h2>");
			
			out.println("<form method='post' action='./update'>");
			out.println("<table align='center'>");
			out.println("<tr><td>Student ID</td><td>"+student.getSid()+"</td>");
			out.println("<input type= 'hidden' name='sid' value='"+student.getSid()+"'></tr>");
			
			out.println("<tr><td>Student Name</td>");
			out.println("<td><input type='text' name='sname' value='"+student.getSname()+"'></td></tr>");
			
			out.println("<tr><td>Student Address</td><td><input type='text' name='saddr' value='"+student.getSaddr()+"'></td></tr>");
			out.println("<td><input type='submit' value='update'></td></tr>");
			out.println("</table></form>");
			
			
		}
		out.println("</body>");
		out.println("</html>");
	}

}
