import java.sql.*;
class ResultSetTypeTest
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.supportsResultSetConcurrency(1003,1007));
		System.out.println(dbmd.supportsResultSetConcurrency(1003,1008));
		System.out.println(dbmd.supportsResultSetType(1003));
		System.out.println(dbmd.supportsResultSetType(1004));
		System.out.println(dbmd.supportsResultSetType(1005));
		
	}
}
