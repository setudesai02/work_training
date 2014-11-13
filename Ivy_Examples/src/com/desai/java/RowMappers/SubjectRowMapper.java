package com.desai.java.RowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import com.desai.java.Subject;

public class SubjectRowMapper implements RowMapper<Subject> {

	@Override
	public Subject mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Subject subject = new Subject();
		subject.setSubject_id(resultSet.getInt(RowMappers_Properties.getString("SubjectRowMapper.id"))); //$NON-NLS-1$
		subject.setSubject_name(resultSet.getString(RowMappers_Properties.getString("SubjectRowMapper.name"))); //$NON-NLS-1$
		return subject;
	}
}
