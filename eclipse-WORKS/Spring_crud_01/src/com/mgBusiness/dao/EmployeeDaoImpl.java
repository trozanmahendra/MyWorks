package com.mgBusiness.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mgBusiness.dto.Employee;
import com.mgBusiness.mapper.EmployeeRowMapper;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate JdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.JdbcTemplate = jdbcTemplate;
	}

	@Override
	public String add(Employee emp) {
		String status = "";
		try {
			List<Employee> empList = JdbcTemplate.query("select * from Empp where eid=" + emp.getEid(),new EmployeeRowMapper());
			String query ="insert into Empp values(?,?,?,?)";
			if (empList.isEmpty()) {
//				int rowCount = JdbcTemplate.update("insert into Empp values(" + emp.getEid() + ",'" + emp.getEaddr()+ "','" + emp.getEname() + "'," + emp.getEsal()  ); 
				int rowCount = JdbcTemplate.update(query, new Object[] {emp.getEid(),emp.getEaddr(),emp.getEname(),emp.getEsal()});
				if (rowCount == 1) {
					status = "Employee details entered successfully";
				} else {
					status = "Employee details entering failed";
				}
			} else {
				status = "Employee details are available already";
			}
		} catch (Exception e) {
			status = "Employee insertion failed";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Employee search(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

}
