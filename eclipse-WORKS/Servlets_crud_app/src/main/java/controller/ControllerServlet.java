package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import factory.ObjectFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.AddStudentService;
import service.DeleteStudentService;
import service.DisplayStudentService;
import service.SearchStudentService;

@jakarta.servlet.annotation.WebServlet("*.do")
public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String reqPath = req.getRequestURI();
		String sid = req.getParameter("sid");
		int sid1;
		if (sid == null) {
			 sid1 = Integer.parseInt("123");
		} else {
			 sid1 = Integer.parseInt(sid); // some manipulation
		}

		String sname = req.getParameter("sname");
		String saddr = req.getParameter("saddr");
		String pwd = req.getParameter("password");
//		--------------------------------------------------------------------------------------
		if (reqPath.endsWith("add.do")) {

			System.out.println(sid1 + sname + saddr);
//			AddStudent add = new AddStudent( );
			AddStudentService add = ObjectFactory.addStudent();
			int count = add.addStudent(sid1, sname, saddr);
			if (count == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("./success.html");
				rd.forward(req, resp);

			} else {
				RequestDispatcher rd = req.getRequestDispatcher("./failure.html");
				rd.forward(req, resp);

			}

		}

//---------------------------------------------------------------------------------------------------------------------------
		else if (reqPath.endsWith("delete.do")) {
			System.out.println(sid1);
			DeleteStudentService delete = ObjectFactory.deleteStudent();
			int count = delete.deleteStudent(sid1);
			if (count == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("./success.html");
				rd.forward(req, resp);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("./failure.html");
				rd.forward(req, resp);

			}

		}
//-------------------------------------------------------------------------------------------------------------------
		else if (reqPath.endsWith("search.do")) {
//			SearchStudent search = new SearchStudent();
			SearchStudentService search = ObjectFactory.searchstdent();
			ResultSet rs = search.searchStudent(sid1);

			try {
				if (!rs.next()) {
					RequestDispatcher rd = req.getRequestDispatcher("./notExisting.html");

					rd.include(req, resp);

				} else {
					RequestDispatcher rd = req.getRequestDispatcher("./existing.html");
					rd.include(req, resp);
					out.println("<html><body>");
					out.println("<h1 align='center'>Student details are below</h1>");
					out.println("<center><table>");
//					while(rs.next()) {
					out.println("<tr><td>Student ID</td><td>" + rs.getInt(1) + "</td></tr>");
					out.println("<tr><td>Student name</td><td>" + rs.getString(2) + "</td></tr>");
					out.println("<tr><td>Student addr</td><td>" + rs.getString(3) + "</td></tr>");
//					}

					out.println("</table></center>");
					out.println("</body></html>");

				}

			} catch (SQLException | ServletException | IOException e) {
				e.printStackTrace();
			}

		} 
//----------------------------------------------------------------------------
		else if (reqPath.endsWith("admindisplay.do")) {
			
			System.out.println("password entered"+pwd);
			
			if (pwd.equals("123")) {
//				DisplayStudentService display = new DisplayStudentService();
//				ResultSet rs = display.displayStudent();
//				
//				try {
//					out.println("<html><body>");
//					out.println("<h1 align='center'>Student details are below</h1>");
//					out.println("<center><table>");
//					while(rs.next()) {
//					out.println("<tr><td>Student ID</td><td>" + rs.getInt(1) + "</td></tr>");
//					out.println("<tr><td>Student name</td><td>" + rs.getString(2) + "</td></tr>");
//					out.println("<tr><td>Student addr</td><td>" + rs.getString(3) + "</td></tr>");
//					}
//
//					out.println("</table></center>");
//					out.println("</body></html>");
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				RequestDispatcher rd = req.getRequestDispatcher("./display.jsp");
				rd.forward(req, resp);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("./failure.html");
				rd.forward(req, resp);
			}

		}

	}

}
