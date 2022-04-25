package jdbc02.MultipleInputs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc02 {

	public static void main(String[] args)/* throws Exception */ {
		try(Scanner sc= new Scanner(System.in);) {
			//Class<?> cls= Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb","root","Bharath916$");
			Statement st = con.createStatement();
			while(true) {
			System.out.print("Enter the sno  : ");
			int sno = sc.nextInt();
			System.out.print("Enter the name  : ");
			String name=sc.next();
			System.out.print("Enter the age  : ");
			int age= sc.nextInt();

			String SQL_Query = String.format("insert into emp values(%d,'%s',%d)",sno,name,age);

			int num=st.executeUpdate(SQL_Query);
			System.out.println(num + " row(s) updated" );

			System.out.println("Do you want to enter another row (Y/N)");
			String option=sc.next();

			//String No="N";

			if(option.equalsIgnoreCase("N")) {
				break;
			}

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("Input completed............");

	}

}
