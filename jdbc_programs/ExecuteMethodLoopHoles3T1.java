import java.sql.*;
public class ExecuteMethodLoopHoles3T1
{
	public static void main(String[] args) throws Exception
	{
		String driver="sun.jdbc.odbc.JdbcOdbcDriver";
		String jdbc_url="jdbc:odbc:demodsn";
		String user="scott";
		String pwd="tiger";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		int rowCount=st.executeUpdate("select * from employees");
		System.out.println(rowCount);
		con.close();
	}
}
