/*
stored procedure:
=================
create or replace procedure getSal(id IN number,sal OUT number) as
BEGIN
   select esal into sal from employees where eno=id;
END;
/
*/
import java.sql.*;
class StoredProceduresDemo2 
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		CallableStatement cst=con.prepareCall("{call getSal(?,?)}");
		cst.setInt(1,300);
		cst.registerOutParameter(2,Types.FLOAT);
		cst.execute();
		System.out.println("Salary ..."+cst.getFloat(2));
		con.close();
	}
}