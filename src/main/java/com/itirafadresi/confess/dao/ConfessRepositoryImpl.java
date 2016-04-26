package com.itirafadresi.confess.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.itirafadresi.confess.domain.Confess;

@Repository
public class ConfessRepositoryImpl implements ConfessRepository
{
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Confess confess)
	{
		em.persist(confess);
	}

}
