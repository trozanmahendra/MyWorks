package com.mgBusiness.handler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class ExecuteEditor extends BodyTagSupport {
	Connection con;
	Statement st;
	ResultSet rs;

	public ExecuteEditor() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb", "mg", "12345");
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static final long serialVersionUID = 1L;

	@Override
	public int doEndTag() throws JspException {
		
		
		try {
			String query = bodyContent.getString();
			boolean b = st.execute(query);
			JspWriter out = bodyContent.getEnclosingWriter();
			if(b==true) {
				rs = st.getResultSet();
				ResultSetMetaData rmd = rs.getMetaData();
				int col_count = rmd.getColumnCount();
				int i=0;
				out.println("<html><body>");
				out.println("<center>");
				out.println("<table border='1'");
				out.println("<tr>");
				out.println("");
				while(i < col_count){
					i++;
					out.println("<th>"+rmd.getColumnName(i)+"</th>");
					}
				out.println("</tr>");
				
				
				while(rs.next()) {
					out.println("<tr>");
					for(int j=1; j<=col_count;j++) {
					out.println("<td>"+rs.getString(j)+" </td>");
					}
					out.println("</tr>");
				}
				
				out.println("</table></center></body></html>");
			}else {
				int rowCount = st.getUpdateCount();
				out.println("<html><body><center><h2>NO OF ROW UPDATED  :  "+rowCount+"</h2></center></body></html>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_PAGE;
	}

}
