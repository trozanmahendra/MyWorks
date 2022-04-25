package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.ConnectionProvider;
import factory.ObjectFactory;

public class SearchStudentService {
	ConnectionProvider cp = ObjectFactory.connectionProvider();

	public ResultSet searchStudent(int sid) {
		ResultSet rs = null;
		try {
			PreparedStatement pst = cp.conn.prepareStatement("select* from student where sid=?");
			pst.setInt(1, sid);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rs;

	}

}
