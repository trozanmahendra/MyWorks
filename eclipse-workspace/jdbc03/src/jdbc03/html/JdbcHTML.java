package jdbc03.html;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcHTML {

	public static void main(String[] args)throws Exception {
		try (FileOutputStream fos = new FileOutputStream("/home/mg/Desktop/emp.html");
				Scanner sc= new Scanner(System.in);
				Scanner sc1= new Scanner(System.in)) 
		{
			String data = "<html><body bgcolor='green'text='white'><center>";
					data=data+"<h1>emp TABLE<h1></hr>";
					data=data+"<table BORDER=2>";
					data=data+"<tr>  <td>sno</td>   <td>name</td>  <td>age</td>";
					
//		Class cls= com.mysql.jdbc.Driver.class;
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb","root","Bharath916$");
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery("select * from emp");
			while(rs.next()) 
			{
				data=data+"<tr><td>" +rs.getInt(1)+ "</td>"
						+ "<td>" +rs.getString(2)+" </td>"
								+ "<td> "+rs.getInt(3)+ "</td>";
			}
			data=data+"</table></body></html>";
			byte[] b = data.getBytes();
			fos.write(b);
			fos.flush();
			System.out.println("HTML file created in the respective directory");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
