package xml_to_db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class Xml_to_db {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb", "mg", "12345");
			con.setAutoCommit(false);
			WebRowSet rs = RowSetProvider.newFactory().createWebRowSet();
			rs.setCommand("select * from movies");
			rs.execute(con);
			FileReader fr = new FileReader("/home/mg/Desktop/movies.xml");
			rs.readXml(fr);
			rs.moveToCurrentRow();
			rs.acceptChanges();
			System.out.println("sucessful------------");
			fr.close();
			rs.close();
		} catch (SQLException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
