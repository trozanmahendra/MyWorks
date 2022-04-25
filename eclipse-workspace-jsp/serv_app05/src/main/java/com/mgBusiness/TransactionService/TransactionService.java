package com.mgBusiness.TransactionService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TransactionService {
	Connection con;
	Statement st;
	public TransactionService() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb","mg","12345");
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public int deposit(String accnum,int depamt) {
		
		int totalAmt=0;
		try {
			st.executeUpdate("update account set balance=balance + "+depamt+" where accnum='"+accnum+"'");
			ResultSet rs = st.executeQuery("select * from account where accnum = '"+accnum+"'");
			rs.next();
			totalAmt = rs.getInt(2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalAmt;
	}

}
