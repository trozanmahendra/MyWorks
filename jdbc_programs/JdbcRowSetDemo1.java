import java.sql.*;
import javax.sql.rowset.*;
public class JdbcRowSetDemo1 
{
	public static void main(String[] args) throws Exception
	{
		RowSetFactory rsf=RowSetProvider.newFactory();
		JdbcRowSet rs=rsf.createJdbcRowSet();
		rs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		rs.setUsername("scott");
		rs.setPassword("tiger");
		rs.setCommand("select * from employees");
		rs.execute();
		System.out.println("Records in Forward Direction");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("---------------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
		}
		System.out.println("Records in Backword Direction");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("---------------------------");
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
		}
		rs.absolute(2);
		System.out.println(rs.getRow()+"--->"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));

		rs.close();
	}
}