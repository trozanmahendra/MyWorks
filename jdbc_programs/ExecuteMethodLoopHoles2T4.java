import java.sql.*;
public class ExecuteMethodLoopHoles2T4
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
		ResultSet rs=st.executeQuery("update employees set esal=7777 where ename='Sachin'");
		while(rs.next())
		{
		}
		con.close();
	}
}
