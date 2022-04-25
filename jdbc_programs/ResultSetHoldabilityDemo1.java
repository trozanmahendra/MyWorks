import java.sql.*;
import java.util.*;
class ResultSetHoldabilityDemo1
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		Statement st =con.createStatement();
		System.out.println(st.getResultSetHoldability());
		
	}
}
