import java.sql.*;
import java.util.*;
class ResultSetHoldabilityDemo2
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		DatabaseMetaData dbmd=con.getMetaData();
		if(dbmd.supportsResultSetHoldability(1))
		{
			System.out.println("HOLD_CURSORS_OVER_COMMIT");

		}
		if(dbmd.supportsResultSetHoldability(2))
		{
			System.out.println("CLOSE_CURSORS_AT_COMMIT");
		}		
	}
}
