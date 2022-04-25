import java.sql.*;
class ResultSetMetaDataDemo1
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employees");
		ResultSetMetaData rsmd=rs.getMetaData();
		String col1=rsmd.getColumnName(1);
		String col2=rsmd.getColumnName(2);
		String col3=rsmd.getColumnName(3);
		String col4=rsmd.getColumnName(4);
		System.out.println(col1+"\t"+col2+"\t"+col3+"\t"+col4);
		System.out.println("---------------------------------");
        while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}
	}
}