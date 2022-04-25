import java.sql.*;
import java.util.*;
import java.io.*;
public class MySQLDemo
{
	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery("select * from employees");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}		
		con.close();
	}
}
