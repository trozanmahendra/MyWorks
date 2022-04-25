package jdbc04.Execute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_execute_Method {
	
	public static void main(String[] args)throws Exception {
		
		try(Scanner sc = new Scanner(System.in))
		{
		try {
		    
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mgdb","root","Bharath916$");
			Statement st = con.createStatement();
			System.out.println("Enter SQL QUERY ");
			final String Sql_Query=sc.nextLine();
			boolean b=st.execute(Sql_Query);
			if(b==true) {
				ResultSet rs= st.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" \t "+rs.getString(2)+" \t "+rs.getInt(3));
				}
			}else if(b==false){
				int updateCount = st.getUpdateCount();
				System.out.println("No of rows affected is "+updateCount);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} 
		

	}

}
