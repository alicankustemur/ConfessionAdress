package com.itirafadresi.confess.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.itirafadresi.confess.domain.Confess;
import com.itirafadresi.dao.BaseDao;

@Repository
public class ConfessRepositoryImpl implements BaseDao<Confess>
{
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Confess confess)
	{
		em.persist(confess);
	}

	@Override
	public List<Confess> getAll()
	{
		List<Confess> result = em.createQuery("Select c from Confess c", Confess.class).getResultList();
		return result;
	}

}
