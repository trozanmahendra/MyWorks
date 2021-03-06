package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(name = "Demo", value = "/", loadOnStartup = 1, initParams = {
//		@WebInitParam(name = "driverClass", value = "com.mysql.jdbc.cj.Driver"),
//		@WebInitParam(name = "driverURL", value = "jdbc:mysql://localhost:3306/mgdb"),
//		@WebInitParam(name = "userName", value = "mg"), @WebInitParam(name = "password", value = "12345") })
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
		out.println("<h1>SERVLET configuration and context details test</h1>");
		
		
		ServletContext context = conf.getServletContext();
//		ServletContext context = getServletContext();
//		ServletContext context = request.getServletContext();
		out.println("<h2>NAME OF THE WEB-APP :  "+context.getServletContextName()+"</h2>");
		
		

		try {
			Class.forName(cls);
			Connection con = DriverManager.getConnection(url, usr, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from movies");

			while (rs.next()) {
				out.println("<html><body>");
				out.println(rs.getInt(1) + "              " + rs.getString(2));
				out.println("<table border = 2 style='color:blue;' align='center'>" + "<tr><th>MOVIE NUMBER</th><td>"
						+ rs.getInt("sno") + "</td></tr>");
				out.println("<tr><th>MOVIE NAME</th><td>" + rs.getString("M_name") + "</td></tr>" + "</table>");
				out.println("</body></html>");

			}
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

}
