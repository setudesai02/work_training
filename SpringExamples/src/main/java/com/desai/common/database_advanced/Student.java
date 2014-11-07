package com.desai.common.database_advanced;

public class Student {
	private int _Id;
	private String _Name;
	private int _age;

	public Student() {
	}

	public Student(int _Id, String _Name, int _age) {
		this._Id = _Id;
		this._Name = _Name;
		this._age = _age;
	}

	public int get_Id() {
		return _Id;
	}

	public void set_Id(int _Id) {
		this._Id = _Id;
	}

	public String get_Name() {
		return _Name;
	}

	public void set_Name(String _Name) {
		this._Name = _Name;
	}

	public int get_age() {
		return _age;
	}

	public void set_age(int _age) {
		this._age = _age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [_Id=");
		builder.append(_Id);
		builder.append(", _Name=");
		builder.append(_Name);
		builder.append(", _age=");
		builder.append(_age);
		builder.append("]");
		return builder.toString();
	}
}
