import java.sql.*;
public class ExecuteMethodLoopHoles2T1
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
		ResultSet rs=st.executeQuery("update employees set esal=7777 where ename='Sachin'");
		con.close();
	}
}
