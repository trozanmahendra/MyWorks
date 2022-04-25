import java.sql.*;
import java.util.*;
import java.text.*;
public class DateInsertDemo
{
	public static void main(String[] args) throws Exception
	{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="scott";
		String pwd="tiger";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Name:");
		String uname=sc.next();
		System.out.println("Enter DOP(dd-mm-yyyy):");
		String dop=sc.next();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date udate=sdf.parse(dop);
		long l = udate.getTime();
		java.sql.Date sdate= new java.sql.Date(l);
		String sqlQuery="insert into users6 values(?,?)";
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		ps.setString(1,uname);
		ps.setDate(2,sdate);
		int  rc =ps.executeUpdate();
		if(rc==0)
			System.out.println("Record Not inserted");
		else
			System.out.println("Record  inserted");
		
		con.close();
	}
}
