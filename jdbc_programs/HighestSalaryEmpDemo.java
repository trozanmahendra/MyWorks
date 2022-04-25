import java.sql.*;
public class HighestSalaryEmpDemo
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
		String sqlQuery="select  * from employees where esal in (select min(esal) from employees)";
		ResultSet rs =st.executeQuery(sqlQuery);
		System.out.println("Highest sal employee information");
		System.out.println("----------------------------------------");
		while(rs.next())
		{			
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}
		con.close();
	}
}
