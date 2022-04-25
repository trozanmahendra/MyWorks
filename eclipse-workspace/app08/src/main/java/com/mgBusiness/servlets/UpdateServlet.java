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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sid = request.getParameter("sid");
		String sname =request.getParameter("sname");
		String saddr = request.getParameter("saddr");
		
		Student student = new Student();
		student.setSid(sid);
		student.setSname(sname);
		student.setSaddr(saddr);
		
		StudentAction studentAction = StudentActionFactory.getStudentAction();
		String status = studentAction.update(student);
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:red' align='center'>MG-BUSINESS</h1>");
		out.println("<h2 style='color:blue' align='center'>STUDENT UPDATE STATUS</h2>");
		
		out.println("<h1 style='color:green;' align = 'center'>");
		if(status.equalsIgnoreCase("success")) {
			out.println("Student Updation Success");
		}if(status.equalsIgnoreCase("failure")) {
			out.println("Student Updation failed");
		}
		out.println("</h1>");
		out.println("<h3 align='center'><a href='./updateform.html'>|updateForm|</a></h3>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
