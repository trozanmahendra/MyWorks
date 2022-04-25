import java.sql.*;
class ResultSetMetaDataDemo
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employees");
		ResultSetMetaData rsmd=rs.getMetaData();
		int count=rsmd.getColumnCount();
		for(int i=1;i<= count;i++)
		{
			System.out.println("Column Number:"+i);
			System.out.println("Column Name:"+rsmd.getColumnName(i));
			System.out.println("Column Type:"+rsmd.getColumnType(i));
			System.out.println("Column Size:"+rsmd.getColumnDisplaySize(i));
			System.out.println("---------------");
		}
		con.close();
	}
}