import java.sql.*;
import java.util.*;
class ResultSetHoldabilityDemo3
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		Statement st =con.createStatement();
		System.out.println("Type :"+st.getResultSetType());
		System.out.println("Concurrency :"+st.getResultSetConcurrency());
		System.out.println("Holdability:"+st.getResultSetHoldability());
		
	}
}
