import java.sql.*;
import java.util.*;
class ResultSetTypesDemo5
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:demodsn","scott","tiger");
		Statement st =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from employees");
		rs.last();
		rs.deleteRow();
		System.out.println("Last Record Deleted Successfully");
		con.close();
	}
}
//Note: Very few Drivers provide support for CONCUR_UPDATABLE Result Sets. Type-1 Driver will provide support for this feature.

//Type-2 driver also can provide support for CONCUR_UPDATABLE ResultSets. But we should not use * in select query.we should use only column names.