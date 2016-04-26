package com.itirafadresi.confess.service;

import java.util.List;

import com.itirafadresi.confess.domain.Confess;

public interface ConfessService
{
	public Confess saveConfess(Confess confess);

	public List<Confess> getAllConfess();
}
