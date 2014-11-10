package com.desai.java.dao;

public interface BaseDao {

	public Object findById(int id);

	public int countAll();

	public boolean dropById(int id);
}
