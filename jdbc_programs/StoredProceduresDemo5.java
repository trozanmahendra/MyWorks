/*
stored procedure:
=================
create or replace procedure getAllEmpInfo2(initchars IN varchar,emps OUT SYS_REFCURSOR) as
BEGIN
   open emps for 
   select * from employees where ename like initchars;
END;
/
*/
import java.sql.*;
import java.util.*;
import oracle.jdbc.*;// for OracleTyes.CURSOR and it is present                                    in                              ojdbc6.jar
class StoredProceduresDemo5
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		CallableStatement cst=con.prepareCall("{call getAllEmpInfo2(?,?)}");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial characters of the name");
		String initialchars=sc.next()+"%";
		cst.setString(1,initialchars);
		cst.registerOutParameter(2,OracleTypes.CURSOR);
		cst.execute();
		ResultSet rs = (ResultSet)cst.getObject(2);
		boolean flag= false;
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-----------------------");
		while(rs.next())
		{
			flag=true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
		}
		if(flag== false)
		{
			System.out.println("No Recors Available");
		}
		con.close();
	}
}