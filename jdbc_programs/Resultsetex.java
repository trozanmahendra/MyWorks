import java.sql.*;
import java.io.*;
class Resultsetex
{
	public static void main(String args[])
	{
		class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		connection con=DriverManager.getconnection("jdbc:odbc:durga","scoot","tiger");
		Statement st=con.CreatStatement();
		ResultSet rs=st.executeQuery("select*from emp1")'
		while(rs.next())
		{
		System.out.print(1);
		System.out.print(2);
		
		
		}
	
	};