import java.sql.*;
class ResultSetTypesDemo6
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:demodsn","scott","tiger");
		Statement st =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from employees");
		rs.moveToInsertRow();//creates an empty record 
		rs.updateInt(1,999);
		rs.updateString(2,"Bunny");
		rs.updateFloat(3,9999);
		rs.updateString(4,"Hyd");
		rs.insertRow();
		con.close();
	}
}
//Note: Very few Drivers provide support for CONCUR_UPDATABLE Result Sets. Type-1 Driver will provide support for this feature.

//Type-2 driver also can provide support for CONCUR_UPDATABLE ResultSets. But we should not use * in select query.we should use only column names.