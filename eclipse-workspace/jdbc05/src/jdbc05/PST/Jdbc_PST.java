package jdbc05.PST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_PST {
	private static final String query="insert into movies values(?,?)";

	public static void main(String[] args) {
//		Class cls = com.mysql.cj.jdbc.Driver.class;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb", 
					"root", "Bharath916$");
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, 2);
			pst.setString(2, "Alavaikuntapuramlo");
			pst.executeUpdate();
			
			pst.setInt(1, 3);
			pst.setString(2, "Son of SatyaMurthy");
			pst.executeUpdate();
			
			pst.setInt(1, 4);
			pst.setString(2, "Bunny");
			pst.executeUpdate();
			
			pst.setInt(1, 5);
			pst.setString(2, "Arya");
			pst.executeUpdate();
			
//			int updateCount=pst.executeUpdate();
			System.out.println("No of rows updated is "+pst);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
