package com.desai.common.database_advanced;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(resultSet.getInt("id"));
		student.setName(resultSet.getString("name"));
		student.setAge(resultSet.getInt("age"));
		return student;
	}

}
