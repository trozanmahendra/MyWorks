package service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.ConnectionProvider;
import factory.ObjectFactory;



public class AddStudentService {
	int rowcount;

	public AddStudentService() {

	}

	public int addStudent(int sid, String name, String addr) {

		try {
			ConnectionProvider cp = ObjectFactory.connectionProvider();
			System.out.println("In side addStudent" + sid + name + addr);
			// String sql="insert into student values("+id+","+name+","+addr+")";
			PreparedStatement pst = cp.conn.prepareStatement("insert into student values(?,?,?)");
			pst.setInt(1, sid);
			pst.setString(2, name);
			pst.setString(3, addr);

			this.rowcount = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowcount;
	}

}
