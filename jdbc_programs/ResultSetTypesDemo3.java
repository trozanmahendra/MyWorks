import java.sql.*;
class ResultSetTypesDemo3
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:demodsn","scott","tiger");
		Statement st =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from employees");
		System.out.println("Records Before Updation");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("---------------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
		}
		System.out.println("Application is going to pausing state,please update database..");
		System.in.read();
		rs.beforeFirst();
		System.out.println("Records After Updation");
		while(rs.next())

		{
			rs.refreshRow();
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
		}		
		con.close();
	}
}
/*Note: Very few Drivers provide support for SCROLL_SENSITIVE Result Sets. Type-1 Driver will provide support for this feature.But it supports only update operation, but not delete and insert operations.

Type-2 driver also can provide support for SCROLL_SENSITIVE ResultSets. But we should not use * in select query.we should use only column names.It supports only update operation, but not delete and insert operations.*/
