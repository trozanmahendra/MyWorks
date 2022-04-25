package jdbc_webrowset1;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class JDBC_WebrowSet1 {

	public static void main(String[] args) {
		try {
			WebRowSet rs = RowSetProvider.newFactory().createWebRowSet();
			rs.setUrl("jdbc:mysql://localhost:3306/mgdb");
			rs.setUsername("mg");
			rs.setPassword("12345");
			rs.setCommand("select * from movies");
			rs.execute();
			FileWriter fw = new FileWriter("/home/mg/Desktop/movies.xml");
			rs.writeXml(fw);
			System.out.println("---------------------file written successfully-------------------------------");
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
W