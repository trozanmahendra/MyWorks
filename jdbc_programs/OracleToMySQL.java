import java.sql.*;
class OracleToMySQL 
{
	public static void main(String[] args) throws Exception
	{
		int count=0;
		Connection con1= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");
		Statement st1= con1.createStatement();
		Statement st2= con2.createStatement();
		ResultSet rs=st1.executeQuery("select * from employees");
		while(rs.next())
		{
			count++;
			int eno=rs.getInt(1);
			String ename=rs.getString(2);
			double esal=rs.getDouble(3);
			String eaddr=rs.getString(4);
			String sqlQuery=String.format("insert into employees values(%d,'%s',%f,'%s')",eno,ename,esal,eaddr);
			st2.executeUpdate(sqlQuery);
		}
		System.out.println("Total Data copied from Oracle to MySQL and number of records:"+count);
		con1.close();
		con2.close();
	}
}
