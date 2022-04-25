import java.sql.*;
public class RowCountDemo
{
	public static void main(String[] args) throws Exception
	{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="scott";
		String pwd="tiger";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		String sqlQuery="select count(*) from employees";
		ResultSet rs =st.executeQuery(sqlQuery);
		if(rs.next())
		{
			System.out.println(rs.getInt(1));
		}
		con.close();
	}
}
