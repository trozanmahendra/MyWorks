package com.mgBusiness.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mgBusiness.DTO.AddStudent;
import com.mgBusiness.DTO.SearchStudent;

@WebServlet("*.do")
public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String reqPath = req.getRequestURI();
		String sid = req.getParameter("sid");
		int sid1 = Integer.parseInt(sid);
//		int sid1 = Integer.parseInt(req.getParameter("sid"));
		String sname = req.getParameter("sname");
		String saddr = req.getParameter("saddr");
//		System.out.println(reqPath);
		if (reqPath.endsWith("add.do")) {
			
			System.out.println(sid1+sname+saddr);
			AddStudent add = new AddStudent();
			int count = add.addStudent(sid1, sname, saddr);
			if (count == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("./success.html");
				rd.forward(req, resp);

			} else {
				RequestDispatcher rd = req.getRequestDispatcher("./failure.html");
				rd.forward(req, resp);

			}
//-------------------------------------------------------------------------------------------------------------------
		} else if (reqPath.endsWith("search.do")) {
			SearchStudent search = new SearchStudent();
			ResultSet rs = search.searchStudent(sid1);
			
			try {
				if(rs.next()) {
					RequestDispatcher rd = req.getRequestDispatcher("./notExisting.html");
					
					rd.include(req, resp);
					out.println("<html><body>");
					out.println("<h1 align='center'>Student details are below</h1>");
					out.println("<center><table>");
					while(rs.next()) {
						out.println("<tr><td>Student ID</td><td>"+rs.getInt(1)+"</td></tr>");
						out.println("<tr><td>Student name</td><td>"+rs.getString(2)+"</td></tr>");
						out.println("<tr><td>Student addr</td><td>"+rs.getString(3)+"</td></tr>");
					}
					
					out.println("</table></center>");
					out.println("</body></html>");
				}else {
					RequestDispatcher rd = req.getRequestDispatcher("./existing.html");
					rd.include(req, resp);
					out.println("<html><body>");
					out.println("<h1 align='center'>Student details are below</h1>");
					out.println("<center><table>");
					while(rs.next()) {
						out.println("<tr><td>Student ID</td><td>"+rs.getInt(1)+"</td></tr>");
						out.println("<tr><td>Student name</td><td>"+rs.getString(2)+"</td></tr>");
						out.println("<tr><td>Student addr</td><td>"+rs.getString(3)+"</td></tr>");
					}
					
					out.println("</table></center>");
					out.println("</body></html>");
					
					
				}
				
			} catch (SQLException | ServletException | IOException e) {
				e.printStackTrace();
			}

		} else {
			


		}

	}

}
