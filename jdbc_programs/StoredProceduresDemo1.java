/*
stored procedure:
=================
create or replace procedure addProc(num1 IN number,num2 IN number,num3 OUT number) as
BEGIN
   num3 :=num1+num2;
END;
/
*/
import java.sql.*;
class StoredProceduresDemo1 
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		CallableStatement cst=con.prepareCall("{call addProc(?,?,?)}");
		cst.setInt(1,100);
		cst.setInt(2,200);
		cst.registerOutParameter(3,Types.INTEGER);
		cst.execute();
		System.out.println("Result.."+cst.getInt(3));
		con.close();
	}
}