import java.sql.*;
public class DbConnectDemo
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:demodsn","scott","tiger");
		Statement st = con.createStatement();
		System.out.println(st.getClass().getName());		
		
	}
}
