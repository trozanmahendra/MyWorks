package com.mgBusiness.DTO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mgBusiness.DAO.ConnectionProvider;
import com.mgBusiness.factory.ObjectFactory;

public class SearchStudent {
	ConnectionProvider cp = ObjectFactory.connectionProvider();
	boolean flag=false;
	ResultSet rs;
	
	public ResultSet searchStudent(int sid) {
		
		try {
			PreparedStatement pst = cp.conn.prepareStatement("select* from student where sid=?");
			pst.setInt(1, sid);
			 rs = pst.executeQuery();
			if(rs.next()) {
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
		
	}

}
