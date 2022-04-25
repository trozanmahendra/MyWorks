package com.loginApp.DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class UserService {
	Connection con;
	Statement st;
	ResultSet rs;

	public UserService() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb", "mg", "1234");
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String checkLogin(String name, String pwd) {
		try {
			int rowCount = st.executeUpdate("insert into login (name,password) values('"+uname+"','"+upwd+"'");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
