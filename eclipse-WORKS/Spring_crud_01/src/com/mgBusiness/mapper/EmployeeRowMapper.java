package com.mgBusiness.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mgBusiness.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee emp = new Employee();
		emp.setEid(rs.getInt("eid"));
		emp.setEaddr(rs.getNString("eaddr"));
		emp.setEname(rs.getString("ename"));
		emp.setEsal(rs.getFloat("esal"));

		return emp;
	}

}
