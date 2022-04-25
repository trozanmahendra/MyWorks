package com.mgbusiness.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mgbusiness.dto.Student;
import com.mysql.cj.jdbc.MysqlDataSource;
import com.mysql.cj.xdevapi.Result;

//@Component("StudentDao")
@Repository("studentDao")
public class studentDaoImpl implements StudentDao {
	@Autowired
	private MysqlDataSource dataSource;

	@Override
	public String add(Student student) {
		String status = "";
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from stud where sid=?");
			pst.setString(1, student.getSid());
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				status = "Existing";
			} else {
				pst = con.prepareStatement("insert into stud values(?,?,?)");
				pst.setString(1, student.getSid());
				pst.setString(2, student.getSname());
				pst.setString(3, student.getSaddr());
				int rowCount = pst.executeUpdate();
				if (rowCount == 1) {
					status = "success";
				} else {
					status = "failure";
				}
			}

		} catch (SQLException e) {
			status = "failure";
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public Student search(String sid) {
		Student student = null;
		try {

			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from stud where sid=?");
			pst.setString(1, sid);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();

			if (b == true) {
				student = new Student();
				student.setSid(rs.getString(1));
				student.setSname(rs.getString(2));
				student.setSaddr(rs.getString(3));
			} else {
				student = null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return student;
	}

	@Override
	public String update(Student student) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from stud where sid=?");
			pst.setString(1, student.getSid());
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				System.out.println("Present values are below");
				System.out.println("--------------------------");
				System.out.println("Student Id      : " + rs.getString(1));
				System.out.println("Student Name    : " + rs.getString(2));
				System.out.println("Student address : " + rs.getString(3));
				System.out.println("Do you want to update Student details  Y/N");
				String option = br.readLine();
				if (option.equalsIgnoreCase("Y")) {
					Connection con1 = dataSource.getConnection();
					PreparedStatement pst1 = con1.prepareStatement("update stud set sname=? , saddr=? where sid=?");
					pst1.setString(1, student.getSname());
					pst1.setString(2, student.getSaddr());
					pst1.setString(3, student.getSid());
					int rowCount1 = pst1.executeUpdate();
					System.out.println( "---------------=---------=--------=-------=-------------------");
					if (rowCount1 != 0) {
						System.out.println("Updation successfull Number of rows updated : " + rowCount1);
					}

				} else {
					System.out.println("No data updated");
				}

			} else {
				System.out.println("No user existing with this id : " + student.getSid());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String delete(String sid) {
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("delete from stud where sid=?");
			pst.setString(1, sid);
			int rowCount = pst.executeUpdate();
			if(rowCount !=0) {
				System.out.println("Deleted rows successfully are : "+rowCount);
			}else {
				System.out.println("Invalid Student ID provided");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
