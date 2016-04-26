package com.itirafadresi.confess.dao;

import java.util.List;

import com.itirafadresi.confess.domain.Confess;

public interface ConfessRepository
{
	public void save(Confess confess);

	public List<Confess> getAll();

}
