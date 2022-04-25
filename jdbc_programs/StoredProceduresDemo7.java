/*
stored procedure:
=================
create or replace function getAllEmpInfo4(no1 IN number,no2 IN number) return SYS_REFCURSOR as
emps SYS_REFCURSOR;
BEGIN
   open emps for 
   select * from employees where eno>=no1 and eno<=no2;
   return emps;
END;
/
*/
import java.sql.*;
import oracle.jdbc.*;// for OracleTyes.CURSOR and it is present in                              ojdbc6.jar
class StoredProceduresDemo7
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		CallableStatement cst=con.prepareCall("{?=call getAllEmpInfo4(?,?)}");
		cst.setInt(2,1000);
		cst.setInt(3,4000);
		cst.registerOutParameter(1,OracleTypes.CURSOR);
		cst.execute();
		ResultSet rs = (ResultSet)cst.getObject(1);
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