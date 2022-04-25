import java.sql.*;
import java.util.*;
import java.text.*;
public class DateRetrive1
{
	public static void main(String[] args) throws Exception
	{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="scott";
		String pwd="tiger";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		PreparedStatement ps = con.prepareStatement("select * from persons");
		ResultSet rs =ps.executeQuery();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yyyy");
		while(rs.next())
		{
			java.sql.Date d=rs.getDate(1);
			String s=sdf.format(d);
			System.out.println(s);
		}
		con.close();
	}
}
