package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig conf = getServletConfig();
		String cls = conf.getInitParameter("driverClass");
		String url = conf.getInitParameter("driverURL");
		String usr = conf.getInitParameter("userName");
		String pwd = conf.getInitParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>SERVLET configuration details test</h1>");

		try {
			Class.forName(cls);
			Connection con = DriverManager.getConnection(url, usr, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from movies");
			

			while (rs.next()) {
				out.println("<html><body>");
				out.println(rs.getInt(1)+"              "+rs.getString(2));
				out.println("<table border = 2 style='color:red;' align='center'>"
						+ "<tr><th>MOVIE NUMBER</th><td>" + rs.getInt("sno") + "</td></tr>");
				out.println("<tr><th>MOVIE NAME</th><td>" + rs.getString("M_name") + "</td></tr>"
						+ "</table>");
				out.println("</body></html>");

			}
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

}
