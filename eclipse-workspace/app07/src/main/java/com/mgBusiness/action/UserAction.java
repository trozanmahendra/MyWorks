package com.mgBusiness.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserAction {
	Connection con = null;
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public UserAction() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb", "mg", "12345");

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

	public String checkLogin(String uname, String upwd) {
		String status = "";

		try {
//			st = con.createStatement();
//			
//			rs =st.executeQuery("select * from reg_user where UNAME='"+uname+"' and UPWD='"+upwd+"';");
//			while(rs.next()) {
//				System.out.println(rs.getString(1)+"    "+rs.getString(2)+"      "+rs.getString(3)+"   "+rs.getString(4));
//			}

			pst = con.prepareStatement("select * from reg_user where UNAME = ? and UPWD = ?");
			pst.setString(1, uname);
			pst.setString(2, upwd);

			rs = pst.executeQuery();

			if (rs.next()) {
				status = "success";
			} else {
				status = "failure";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}

	public String registration(String uname, String upwd, String umail, String umobile) {
		String status = "";
		try {
			pst = con.prepareStatement("select * from reg_user where UNAME =?");
			pst.setString(1, uname);
			rs = pst.executeQuery();
			if (rs.next()) {
				status = "existing";
			} else {
				pst = con.prepareStatement("insert into reg_user values(?,?,?,?)");
				pst.setString(1, uname);
				pst.setString(2, upwd);
				pst.setString(3, umail);
				pst.setString(4, umobile);

				int rowCount = pst.executeUpdate();
				if (rowCount == 1) {
					status = "success";
				} else {
					status = "failure";
				}
			}

		} catch (Exception e) {
			
			status = "failure";
			e.printStackTrace();
		}

		return status;

	}
}
