package com.mgbusiness.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mgbusiness.dto.Student;
import com.mgbusiness.service.StudentService;

@Controller("studentController")
public class StudentControllerImpl implements StudentController {

	BufferedReader br = null;
	@Autowired
	private StudentService studentService;

	public StudentControllerImpl() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addStudent() {
		try {
			System.out.print("Student ID   : ");
			String sid = br.readLine();
			System.out.print("Student Name : ");
			String sname = br.readLine();
			System.out.print("Stu Address  :");
			String saddr = br.readLine();

			Student student = new Student();
			student.setSid(sid);
			student.setSname(sname);
			student.setSaddr(saddr);

			String status = studentService.addStudent(student);
			if (status.equals("Existing")) {
				System.out.println("\n\t---------Student Details are already Existing in DataBase-----------------\n");
			}
			if (status.equals("success")) {
				System.out.println("\n\t----------Student data Insertion successful--------------- \n");
			}
			if (status.equals("failure")) {
				System.out.println("\n\t----------Student insertion Failed-------------------------\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void searchStudent() {
		try {
			System.out.print("Student ID : ");
			String sid = br.readLine();
			Student student = studentService.searchStudent(sid);
			if (sid.equals(null)) {
				System.out.println("Student ID should'nt be null");
			} else if (student == null) {
				System.out.println("Student details are not existing in the database");
			} else {
				System.out.println("Student Details");
				System.out.println("-----------------------");
				System.out.println("SID     SNAME     SADDR");
				System.out.println(student.getSid() + "     " + student.getSname() + "     " + student.getSaddr());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent() {
		try {
			System.out.print("Student ID : ");
			String sid = br.readLine();
			System.out.print("Student Name : ");
			String sname = br.readLine();
			System.out.print("Student Address : ");
			String saddr = br.readLine();

			Student student = new Student();
			student.setSid(sid);
			student.setSname(sname);
			student.setSaddr(saddr);
			studentService.updateStudent(student);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteStudent() {
		try {
			System.out.print("Student ID : ");
			String sid = br.readLine();

			Student student = new Student();
			student.setSid(sid);

			studentService.deleteStudent(sid);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
