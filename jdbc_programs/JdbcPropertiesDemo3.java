import java.sql.*;
class JdbcPropertiesDemo3
{
	public static void main(String[] args) throws Exception
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb?user=root&password=root");
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery("select * from employees");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("---------------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
		}
		con.close();
	}
}