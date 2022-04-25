package com.mgBusiness.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	Connection con;
	public ConnectionProvider() {
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost/mgdb","mg","12345");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

}
