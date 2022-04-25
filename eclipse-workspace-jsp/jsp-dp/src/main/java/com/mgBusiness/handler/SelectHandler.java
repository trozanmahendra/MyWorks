package com.mgBusiness.handler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class SelectHandler extends TagSupport {
	private String table;
	Connection con;
	Statement st;
	ResultSet rs;

	public SelectHandler() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb", "mg", "12345");
			st = con.createStatement();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void setTable(String table) {
		this.table = table;
	}

	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();

		try {
			rs = st.executeQuery("select * from "+table);
			out.println("<html><body>");
			out.println("<h1 Style='color:red;' align='center'>");
			out.println("MG BUSINESS SOLUTIONS</h1>");
			out.println("<table align='center' bgcolor='cyan' border='1'>");
			out.println("<tr><td>eno</td><td>ename</td><td>eaddr</td>");
			while (rs.next()) {
				out.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)
						+ "</td>");
			}
			out.println("</table>");
			out.println("</body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return SKIP_BODY;
	}

}
