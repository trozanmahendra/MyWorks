import java.sql.*;
class SupportsResultSetDemo
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		DatabaseMetaData metadata = con.getMetaData();
		boolean read = metadata.supportsResultSetType(1007);
		boolean updatabable = metadata.supportsResultSetType(1008);
		boolean forward = metadata.supportsResultSetType(1003);
		boolean scrollinsensitive = metadata.supportsResultSetType(1004);
		boolean scrollsensitive = metadata.supportsResultSetType(1005);
		System.out.println("Read Only: "+read);
		System.out.println("updatable: "+updatabable);
		System.out.println("forward Only: "+forward);
		System.out.println("scrollinsensitive: "+scrollinsensitive);
		System.out.println("scroll sensitive: "+scrollsensitive);
		con.close();
	}
}