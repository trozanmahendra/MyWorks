import java.sql.*;
public class Type2DriverDemo
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Type-2 Driver Demo");
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:oci:@XE","scott","tiger");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from movies");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getString(3)+".."+rs.getString(4));
		}
		con.close();
	}
}
