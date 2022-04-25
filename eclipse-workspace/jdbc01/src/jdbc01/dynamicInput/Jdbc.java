package jdbc01.dynamicInput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc {

	public static void main(String[] args)throws Exception {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter sno : ");
			int sno=sc.nextInt();
			
			System.out.print("ENter name  : ");
			String name=sc.next();
			
			System.out.print("Enter age  : ");
			int age=sc.nextInt();
			
			Class<?> cls=com.mysql.cj.jdbc.Driver.class;
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb",
					"root",
					"Bharath916$");
			Statement st = con.createStatement();
			String str= String.format("insert into emp values(%d,'%s',%d)",sno,name,age);
			int rs=st.executeUpdate(str);
			System.out.println(rs+" rows updated\n");
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		}

}
