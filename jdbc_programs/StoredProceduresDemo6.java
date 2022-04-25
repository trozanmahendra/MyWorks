/* create or replace function getAvg(id1 IN number,id2 IN number)return number
as
sal1 number;
sal2 number;
BEGIN
  select esal into sal1 from employees where eno=id1;
  select esal into sal2 from employees where eno=id2;
  return (sal1+sal2)/2;
END;
/
*/

import java.sql.*;
class StoredProceduresDemo6 
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
		CallableStatement cst=con.prepareCall("{?=call getAvg(?,?)}");
		cst.setInt(2,100);
		cst.setInt(3,300);
		cst.registerOutParameter(1,Types.FLOAT);
		cst.execute();
		System.out.println("Average Salary ..."+cst.getFloat(1));
		con.close();
	}
}