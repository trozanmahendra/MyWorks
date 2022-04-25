package com.mgbusiness.act;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mgBusiness.Student;

public class StudentAction {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;

	public StudentAction() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgdb", "mg", "12345");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Student getStudent(String sid) {
		Student student = null;
		try {
			pst = con.prepareStatement("select * from stud where SID=?");
			pst.setString(1, sid);
			rs = pst.executeQuery();

			if (rs.next()) {
				student = new Student();
				student.setSid(rs.getString("sid")); // sid
				student.setSname(rs.getString("sname")); // sname
				student.setSaddr(rs.getString("saddr")); // saddr
			} else {
				student = null;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return student;
	}

	public String update(Student student) {
		String status = "";
		try {
			
			
//			pst = con.prepareStatement("update stud set SNAME = '"+student.getSname()+"', SADDR = '"+student.getSaddr()+"' where SID = '"+student.getSid()+"'");
			
			pst = con.prepareStatement("UPDATE stud SET SNAME = ?, SADDR = ? where SID = ?");
			pst.setString(1, student.getSname());
			pst.setString(2, student.getSaddr());
			pst.setString(3, student.getSid());
			int rowCount = pst.executeUpdate();
			
			
			if (rowCount == 1) {
				status = "success";
			} else {
				status = "failure";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}
}
