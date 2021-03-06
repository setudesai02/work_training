package com.desai.common.pojo;

import java.io.Serializable;

import com.desai.common.utils.GuidGenerator;
import com.desai.common.utils.GuidGeneratorException;


public class Subject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4367164667167006540L;
	private String subject_id;
	private String subject_name;

	public Subject() throws GuidGeneratorException {
		this("");
	}

	public Subject(String name) throws GuidGeneratorException {
		this(GuidGenerator.getInstance().getGuid(), name);
	}

	private Subject(String subject_id, String subject_name) {
		this.subject_id = subject_id;
		this.subject_name = subject_name;
	}

	/**
	 * @return the subject_id
	 */
	public String getSubject_id() {
		return subject_id;
	}

	/**
	 * @param subject_id
	 *            the subject_id to set
	 */
	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}

	/**
	 * @return the subject_name
	 */
	public String getSubject_name() {
		return subject_name;
	}

	/**
	 * @param subject_name
	 *            the subject_name to set
	 */
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Subject [subject_id=");
		builder.append(subject_id);
		builder.append(", subject_name=");
		builder.append(subject_name);
		builder.append("]");
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((subject_id == null) ? 0 : subject_id.hashCode());
		result = prime * result
				+ ((subject_name == null) ? 0 : subject_name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Subject)) {
			return false;
		}
		Subject other = (Subject) obj;
		if (subject_id == null) {
			if (other.subject_id != null) {
				return false;
			}
		} else if (!subject_id.equals(other.subject_id)) {
			return false;
		}
		if (subject_name == null) {
			if (other.subject_name != null) {
				return false;
			}
		} else if (!subject_name.equals(other.subject_name)) {
			return false;
		}
		return true;
	}

}
