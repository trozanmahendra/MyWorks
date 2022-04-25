import java.sql.*;
public class ExecuteMethodLoopHoles3T4
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
		int rowCount=st.executeUpdate("select * from employees");
		System.out.println(rowCount);
		con.close();
	}
}
