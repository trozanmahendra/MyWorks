/*
stored procedure:
=================
create or replace procedure getAllEmpInfo1(sal IN number,emps OUT SYS_REFCURSOR) as
BEGIN
   open emps for 
   select * from employees where esal>sal;
END;
/
*/
import java.sql.*;
import oracle.jdbc.*;// for OracleTyes.CURSOR and it is present in ojdbc6.jar
class StoredProceduresDemo4
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		CallableStatement cst=con.prepareCall("{call getAllEmpInfo1(?,?)}");
		cst.setFloat(1,10000);
		cst.registerOutParameter(2,OracleTypes.CURSOR);
		cst.execute();
		ResultSet rs = (ResultSet)cst.getObject(2);
		boolean flag=false;
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-----------------------");
		while(rs.next())
		{
			flag=true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
		}
		if(flag== false)
		{
			System.out.println("No Records Available");
		}
		con.close();
	}
}