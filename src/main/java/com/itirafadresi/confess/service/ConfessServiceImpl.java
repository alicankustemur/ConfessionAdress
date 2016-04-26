package com.itirafadresi.confess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itirafadresi.confess.dao.ConfessRepositoryImpl;
import com.itirafadresi.confess.domain.Confess;

@Service
public class ConfessServiceImpl implements ConfessService
{
	@Autowired
	private ConfessRepositoryImpl repository;

	public ConfessRepositoryImpl getRepository()
	{
		return repository;
	}

	public void setRepository(ConfessRepositoryImpl repository)
	{
		this.repository = repository;
	}

	@Transactional
	@Override
	public Confess saveConfess(Confess confess)
	{
		repository.save(confess);
		return confess;
	}

	@Transactional
	@Override
	public List<Confess> getAllConfess()
	{
		return repository.getAll();
	}

}
