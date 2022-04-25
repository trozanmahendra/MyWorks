import java.sql.*;
import java.util.*;
import java.text.*;
public class DateInsert2
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
		System.out.println("Enter DOB(dd-mm-yyyy):");
		String dob=sc.next();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date d = sdf.parse(dob);
		long l = d.getTime();
		java.sql.Date sqlDate= new java.sql.Date(l);
		String sqlQuery="insert into persons values(?)";
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		ps.setDate(1,sqlDate);
		int  rc =ps.executeUpdate();
		if(rc==0)
			System.out.println("Record Not inserted");
		else
			System.out.println("Record  inserted");
		
		con.close();
	}
}
