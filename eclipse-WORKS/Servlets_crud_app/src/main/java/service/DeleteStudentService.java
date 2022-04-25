package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.ConnectionProvider;
import factory.ObjectFactory;

public class DeleteStudentService {
	int rowCount;
	ConnectionProvider cp = ObjectFactory.connectionProvider();

	public int deleteStudent(int sid) {
		
		try {
			PreparedStatement pst = cp.conn.prepareStatement("delete from student where sid=?");
			pst.setInt(1, sid);
			rowCount = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowCount;

	}

}
