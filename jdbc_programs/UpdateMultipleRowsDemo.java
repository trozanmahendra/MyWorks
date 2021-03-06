import java.sql.*;
import java.util.*;
public class UpdateMultipleRowsDemo
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter increment Amount:");
		double increment =sc.nextDouble();
		System.out.println("Enter Salary Range:");
		double salRange =sc.nextDouble();
		String sqlQuery=String.format("update employees set esal=esal+%f where esal<=%f",increment,salRange);
		int updateCount=st.executeUpdate(sqlQuery);
		System.out.println("The number of rows updated :"+updateCount);
		con.close();
	}
}
