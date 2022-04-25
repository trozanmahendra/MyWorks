/*
stored procedure:
=================
create or replace function getDeletedEMPInfo(no1 IN number,count OUT number) return SYS_REFCURSOR as
emps SYS_REFCURSOR;
BEGIN
 open emps for
      select * from employees where eno=no1;
      delete from employees where eno=no1;
	  count :=SQL%ROWCOUNT;
   return emps;
END;
/
*/
import java.sql.*;
import oracle.jdbc.*;// for OracleTyes.CURSOR and it is present in                              ojdbc6.jar
class StoredProceduresDemo8
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		CallableStatement cst=con.prepareCall("{?=call getDeletedEMPInfo(?,?)}");
		cst.setInt(2,300);
		cst.registerOutParameter(1,OracleTypes.CURSOR);
		cst.registerOutParameter(3,Types.INTEGER);
		cst.execute();
		ResultSet rs = (ResultSet)cst.getObject(1);
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-----------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
		}
		int count=cst.getInt(3);
		System.out.println("The number of rows deleted: "+count);
		con.close();
	}
}
