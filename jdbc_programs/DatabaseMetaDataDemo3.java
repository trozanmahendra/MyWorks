import java.sql.*;
import java.util.*;
class DatabaseMetaDataDemo3
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		DatabaseMetaData dbmd=con.getMetaData();
		String catalog=null;
		String schemaPattern=null;
		String tableNamePattern="employees";
		String columnNamePattern=null;
		ResultSet rs = dbmd.getColumns(catalog,schemaPattern,tableNamePattern,columnNamePattern);
		//the parameters can help limit the number of tables that are returned in the ResultSet
		//the ResultSet contains several columns and 4th column represents column name and 5th column represents column type.
		while(rs.next())
		{
			String cname=rs.getString(4);
			int ctype=rs.getInt(5);
			System.out.println(cname+"..."+ctype);
		}
		con.close();
	}
}