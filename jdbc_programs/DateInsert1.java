import java.sql.*;
import java.util.*;
import java.text.*;
public class DateInsert1
{
	public static void main(String[] args) throws Exception
	{
		try{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="scott";
		String pwd="tiger";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);		
		String sqlQuery="insert into TestDates values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		ps.setString(1,"001");
		java.util.Date d = new java.util.Date();
		long t =d.getTime();
		java.sql.Date sqlDate= new java.sql.Date(t);
		java.sql.Time sqlTime= new java.sql.Time(t);
		java.sql.Timestamp sqlTimestamp= new java.sql.Timestamp(t);
		System.out.println(sqlDate);
		System.out.println(sqlTime);
		System.out.println(sqlTimestamp);
		ps.setDate(2,sqlDate);
		ps.setTime(3,sqlTime);
		ps.setTimestamp(4,sqlTimestamp);
		int  rc =ps.executeUpdate();
		if(rc==0)
			System.out.println("Record Not inserted");
		else
			System.out.println("Record  inserted");
		
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
