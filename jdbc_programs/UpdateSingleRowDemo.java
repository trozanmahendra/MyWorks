import java.sql.*;
public class UpdateSingleRowDemo
{
	public static void main(String[] args) throws Exception
	{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="scott";
		String pwd="tiger";
		String sql_query="update employees set esal=7777 where ename='Durga'";
        Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		int updateCount=st.executeUpdate(sql_query);
		System.out.println("The number of rows updated :"+updateCount);
		con.close();
	}
}
