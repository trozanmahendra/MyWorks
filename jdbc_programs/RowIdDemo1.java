import java.sql.*;
public class RowIdDemo1
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:scott/tiger@localhost:1521:XE");
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery("select rowid,eno,ename,esal,eaddr from employees");
		while(rs.next())
		{
			RowId id = rs.getRowId(1);
			byte[] b= id.getBytes();
			String rowid=new String(b);			System.out.println(rowid+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4)+"\t"+rs.getString(5));
		}
		
		con.close();
	}
}
