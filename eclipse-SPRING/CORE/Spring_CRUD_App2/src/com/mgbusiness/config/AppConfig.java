package com.mgbusiness.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mgbusiness.controller.StudentController;
import com.mgbusiness.controller.StudentControllerImpl;
import com.mgbusiness.dao.StudentDao;
import com.mgbusiness.dao.studentDaoImpl;
import com.mgbusiness.service.StudentService;
import com.mgbusiness.service.StudentServiceImpl;
import com.mysql.cj.jdbc.MysqlDataSource;

@Configuration
public class AppConfig {
	@Bean
	public MysqlDataSource dataSource() {
		MysqlDataSource dataSource = null;
		try {
			dataSource = new MysqlDataSource();
			dataSource.setURL("jdbc:mysql://localhost:3306/mgdb");
			dataSource.setUser("mg");
			dataSource.setPassword("12345");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataSource;

	}

	@Bean
	public StudentDao studentDao() {
		StudentDao studentDao = new studentDaoImpl();
		return studentDao;
	}
	@Bean
	public StudentController studentController() {
		StudentController studentController = new StudentControllerImpl();
		return studentController;
	}
	@Bean
	public StudentService studentService() {
		StudentService studentService = new StudentServiceImpl();
		return studentService;
	}

}
