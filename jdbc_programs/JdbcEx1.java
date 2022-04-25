import java.sql.*;
public class  JdbcEx1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		sun.jdbc.odbc.JdbcOdbcConnection con = (sun.jdbc.odbc.JdbcOdbcConnection)DriverManager.getConnection("jdbc:odbc:advdsn","scott","tiger");
		if(con != null)
		{
			System.out.println("Connection Established Succefully");
		}
		else
		{
			System.out.println("Connection not established");
		}
		System.out.println(con.getClass().getName());

	}
}




