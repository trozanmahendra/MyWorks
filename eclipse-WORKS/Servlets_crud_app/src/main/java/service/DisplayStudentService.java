package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.ConnectionProvider;
import factory.ObjectFactory;

public class DisplayStudentService {
	ConnectionProvider cp = ObjectFactory.connectionProvider();
	
	public ResultSet displayStudent() {
		ResultSet rs = null;
		try {
			PreparedStatement pst = cp.conn.prepareStatement("select * from student");
			 rs = pst.executeQuery();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
		
	}
}
