package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDao;
import com.ppx.web_service.entity.Login;

import java.io.Serializable;
import java.util.List;

public class LoginDAO extends BasicDao<Login> {

	public LoginDAO() {
		super();
	}

	@Override
	public Login get(Serializable id) {
		return super.get(id);
	}

	@Override
	public List<Login> getAll() {
		return super.getAll();
	}

	@Override
	public List<Login> find(String hql) {
		return super.find(hql);
	}

	@Override
	public void save(Object o) {
		super.save(o);
	}

	@Override
	public void remove(Object o) {
		super.remove(o);
	}

	@Override
	public void update(Object o) {
		super.update(o);
	}
}
