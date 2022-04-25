import java.sql.*;
import java.util.*;
import javax.sql.rowset.*;
public class JdbcRowSetDemo2 
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
		rs.moveToInsertRow();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Employee Number:");
			int eno=sc.nextInt();
			System.out.println("Employee Name:");
			String ename=sc.next();
			System.out.println("Employee Sal:");
			double esal=sc.nextDouble();
			System.out.println("Employee Address:");
			String eaddr=sc.next();
			rs.updateInt(1,eno);
			rs.updateString(2,ename);
			rs.updateDouble(3,esal);
			rs.updateString(4,eaddr);
			rs.insertRow();
			System.out.println("Do U want to Insert one more record[Yes/No]:");
			String option = sc.next();
			if(option.equalsIgnoreCase("No"))
			{
				break;
			}
		}
		rs.close();
	}
}