package Io_oper;

import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class WebrowSet_IO_Operations {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			WebRowSet rs = RowSetProvider.newFactory().createWebRowSet();
			rs.setUrl("jdbc:mysql://localhost:3306/mgdb?autocommit=false");
			rs.setUsername("mg");
			rs.setPassword("12345");

			rs.setCommand("select * from movies");
			rs.execute();
			System.out.println("-----------insertion operations--------------");
			rs.moveToInsertRow();
			while (true) {
				System.out.print("Enter the sno  :  ");
				int sno = sc.nextInt();
				System.out.print("Enter the movie name  :  ");
				String str = sc.next();
				rs.updateInt(1, sno);
				rs.updateString(2, str);
				rs.insertRow();
				System.out.println("Do you want to insert a row again ?  [Y/N]");
				String opt = sc.next();
				if (opt.equalsIgnoreCase("n")) {
					break;
				}
			}
			rs.moveToCurrentRow();
			rs.acceptChanges();
//			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
