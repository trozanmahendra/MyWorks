package com.mgBusiness;

import java.sql.Connection;
import java.sql.DriverManager;

//import java.sql.*;
public class ConProvider {

	public static Connection getConnection() {
	Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb", "root", "Bharath916$");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	return con;
	}
}
