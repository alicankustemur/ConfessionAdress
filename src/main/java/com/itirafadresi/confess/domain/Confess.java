package com.itirafadresi.confess.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Confess implements Serializable
{
	@Id
	@GeneratedValue
	private long	id;

	private String	nickname;
	private String	mail;
	private String	university;
	private String	header;

	@Column(columnDefinition = "TEXT")
	private String	confess;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getNickname()
	{
		return nickname;
	}

	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	public String getMail()
	{
		return mail;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}

	public String getUniversity()
	{
		return university;
	}

	public void setUniversity(String university)
	{
		this.university = university;
	}

	public String getHeader()
	{
		return header;
	}

	public void setHeader(String header)
	{
		this.header = header;
	}

	public String getConfess()
	{
		return confess;
	}

	public void setConfess(String confess)
	{
		this.confess = confess;
	}

}
