import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb", "mg", "12345");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from movies");

			rs.next() ;
                out.println("<h1>SERVLET configuration details test</h1>");
				out.println("<html><body><table border = 2 align = 'center'>'");
				out.println("<tr><th>MOVIE NUMBER</th><td>"+rs.getint("sno")+"</td></tr>");
                out.println("<tr><th>MOVIE NAME</th><td>"+rs.getString("M_name")+"</td></tr>");
				out.println("</table></body></html>");
			

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

}

