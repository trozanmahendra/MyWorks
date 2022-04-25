import java.sql.*;
public class DbConnectDemo1 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection  con=DriverManager.getConnection("jdbc:odbc:demodsn7","scott","tiger");
        if(con != null)
		{
			System.out.println("Connection established Successfully");
		}
		else
		{
			System.out.println("Connection not established");
		}
		
	}
}
