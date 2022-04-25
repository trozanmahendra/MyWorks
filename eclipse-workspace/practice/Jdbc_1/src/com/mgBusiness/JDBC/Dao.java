package com.mgBusiness.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	ConnectionProvider c = new ConnectionProvider();

	void selecting() {

		try {
			PreparedStatement pst = c.con.prepareStatement("select * from emp");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1) + "--\t---" + rs.getString(2) + "--\t---" + rs.getString(3)
						+ "-\t----" + rs.getString(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void DataEnteringORUpdating() {

		try {
			PreparedStatement pst = c.con.prepareStatement("insert into movies values(?,?)");
			pst.setInt(1, 11);
			pst.setNString(2, "SAAHO");
			int count = pst.executeUpdate();
			System.out.println("\n\n\nNO OF RECORDS UPDATED IN DATABASE IS : " + count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
