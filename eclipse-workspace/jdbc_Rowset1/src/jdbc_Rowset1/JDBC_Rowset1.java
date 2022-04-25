package jdbc_Rowset1;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JDBC_Rowset1 {

	public static void main(String[] args) {
		try {
			RowSetFactory rsf = RowSetProvider.newFactory();
			JdbcRowSet rs = rsf.createJdbcRowSet();
			rs.setUrl("jdbc:mysql://localhost:3306/mgdb");
			rs.setUsername("mg");
			rs.setPassword("12345");
			rs.setCommand("select * from movies");
			rs.execute();
			System.out.println("-------------forward motion---------------");
			System.out.println("------------------------------------------------");
			System.out.println("sno\tmname");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
				}
			System.out.println("--------------backward motion--------------");
			System.out.println("--------------------------------------------");
			System.out.println("sno\tmname");
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
			rs.absolute(4);
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
