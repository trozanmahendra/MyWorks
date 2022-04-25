import java.sql.*;
public class RowIdDemo2
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:scott/tiger@localhost:1521:XE");
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery("select * from employees where rowid='AAAFReAABAAAK+ZAAD'");
		if(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}
		con.close();
	}
}
