import java.sql.*;
public class JdbcConnectDemo 
{
	public static void main(String[] args)throws Exception 
	{
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		sun.jdbc.odbc.JdbcOdbcConnection con=(sun.jdbc.odbc.JdbcOdbcConnection)DriverManager.getConnection("jdbc:odbc:demodsn1","scott","tiger");
		if(con != null)
		{
			System.out.println("Connection established successfully");
		}
		else
		{
			System.out.println("Connection Not established");
		}
		
				
	}
}
