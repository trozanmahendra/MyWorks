import java.sql.*;
public class InsertSingleRowDemo 
{
	public static void main(String[] args) throws Exception
	{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="scott";
		String pwd="tiger";
		Class.forName(driver);
		String sql_query="insert into employees values(300,'Radhika',3000,'Chennai')";        
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		int updateCount=st.executeUpdate(sql_query);
		System.out.println("The number of rows inserted :"+updateCount);
		con.close();
	}
}
