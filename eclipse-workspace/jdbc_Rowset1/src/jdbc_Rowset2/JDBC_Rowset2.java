package jdbc_Rowset2;


import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;


public class JDBC_Rowset2 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			RowSetFactory rsf = RowSetProvider.newFactory();
			CachedRowSet rs = rsf.createCachedRowSet();
			rs.setUrl("jdbc:mysql://localhost:3306/mgdb?relaxAutoCommit=true");
			rs.setUsername("root");
			rs.setPassword("Bharath916$");
			rs.setCommand("select * from movies");
			
			rs.execute();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"             "+rs.getString(2));
			}
			
			rs.moveToInsertRow();
			System.out.println("INSERTING A ROW IN ABOVE TABLE \n -----------------------------------------");
			
			while(true) {
				System.out.print("enter sno         :   ");
				int sno = sc.nextInt();
				System.out.print("enter movie name  :  ");
				String mname = sc.next();
				rs.updateInt(1, sno);
				rs.updateString(2, mname);
				rs.insertRow();
				
				System.out.println();
				System.out.println("Do you want to enter another row  [Y/N] ");
				String opt = sc.next();
				if(opt.equalsIgnoreCase("n")) {
					break;
				}
				
			}rs.moveToCurrentRow();
			System.out.println("----------------------updations are successful----------------");
			rs.commit();
			rs.close();
			
			
			
			
		} catch (SQLException e) {
			
			e.getMessage();
		}
		
	}

}
