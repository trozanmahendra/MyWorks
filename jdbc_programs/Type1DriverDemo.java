import java.sql.*;
public class Type1DriverDemo
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:demodsn","scott","tiger");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from movies");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getString(3)+".."+rs.getString(4));
		}
		con.close();
	}
}
