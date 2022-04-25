import java.sql.*;
import java.util.*;
class ResultSetTypesDemo4T2
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@XE","scott","tiger");
		Statement st =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select eno,ename,esal,eaddr from employees");
		while(rs.next())
		{
			float esal = rs.getFloat(3);
			if(esal<5000)
			{
				float incr_sal=esal+777;
				rs.updateFloat(3,incr_sal);
				rs.updateRow();
			}
		}
		con.close();
	}
}
//Note: Very few Drivers provide support for CONCUR_UPDATABLE Result Sets. Type-1 Driver will provide support for this feature.

//Type-2 driver also can provide support for CONCUR_UPDATABLE ResultSets. But we should not use * in select query.we should use only column names.