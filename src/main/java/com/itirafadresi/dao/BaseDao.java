package com.itirafadresi.dao;

import java.util.List;

public interface BaseDao<T>
{
	public void save(T t);

	public List<T> getAll();
}
