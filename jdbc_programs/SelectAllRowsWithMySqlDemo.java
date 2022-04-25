import java.sql.*;
public class SelectAllRowsWithMySqlDemo
{
	public static void main(String[] args) throws Exception
	{
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:///durgadb","root","root");
		Statement st = con.createStatement();
		String sqlQuery="select * from employees";
		boolean flag= false;
		ResultSet rs =st.executeQuery(sqlQuery);
		System.out.println("ENO\tENAME\tESALARY\tEADDR");
		System.out.println("--------------------------------------");
		while(rs.next())
		{
			flag=true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}
		if(flag==false)
		{
			System.out.println("No Records found");
		}
		con.close();
	}
}
