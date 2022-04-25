package com.mgbusiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgbusiness.dao.StudentDao;
import com.mgbusiness.dto.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public String addStudent(Student student) {
		String status = studentDao.add(student);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		Student student = studentDao.search(sid);
		return student;
	}

	@Override
	public Student getStudent(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		studentDao.update(student);
		return null;
	}

	@Override
	public String deleteStudent(String sid) {
		studentDao.delete(sid);
		return null;
	}

}
