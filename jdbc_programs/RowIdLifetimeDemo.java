import java.sql.*;
public class RowIdLifetimeDemo
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:mysql:///durgadb?user=root&password=root123");
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.getRowIdLifetime());
		System.out.println(dbmd.getMaxConnections());
		con.close();
	}
}
