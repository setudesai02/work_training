package spring.desai.RowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import spring.desai.dao.SubjectDao;
import spring.desai.pojo.Subject;
import spring.desai.pojo.Tutor;

public class TutorRowMapper implements RowMapper<Tutor> {

	@Autowired
	private SubjectDao subjectDao;

	@Override
	public Tutor mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Tutor tutor = new Tutor();
		tutor.setId(resultSet.getString(RowMappers_Properties
				.getString("TutorRowMapper.id"))); //$NON-NLS-1$
		tutor.setName(resultSet.getString(RowMappers_Properties
				.getString("TutorRowMapper.name"))); //$NON-NLS-1$
		tutor.setSubject((Subject) subjectDao.findById(resultSet
				.getString(RowMappers_Properties
						.getString("TutorRowMapper.subject_id")))); //$NON-NLS-1$
		return tutor;
	}

}
