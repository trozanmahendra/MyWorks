package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args)throws Exception 
	{
		try {
			//load and register driver
			Class<?> c= com.mysql.cj.jdbc.Driver.class;
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb","root","Bharath916$");
			//create Statement object
			Statement st1=con.createStatement();
			
			Statement st2=con.createStatement();
			int rs2=st2.executeUpdate("UPDATE emp SET sno=4 WHERE name='E L Goud'");
			System.out.println(rs2+" rows updated\n");
			
			ResultSet rs1=st1.executeQuery("SELECT * FROM emp");
			while(rs1.next()) {
				System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+" \t"+rs1.getString(3));
			}

		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
			e.getMessage();
		}

	}

}

