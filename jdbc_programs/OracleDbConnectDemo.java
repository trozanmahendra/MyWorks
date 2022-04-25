import java.sql.*;
public class OracleDbConnectDemo 
{
	public static void main(String[] args) throws Exception 
	{
		//1.Load and Register Driver class
		Class.forName("oracle.jdbc.OracleDriver");
		//2.Establish Connection between Java Appln and Db
		oracle.jdbc.driver.T4CConnection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
		if(con != null)
		{
			System.out.println("Connection Established Successfully");
		}
		else
		{
			System.out.println("Connection Not Established");
		}
		System.out.println("class name is:"+con.getClass().getName());

	}
}
