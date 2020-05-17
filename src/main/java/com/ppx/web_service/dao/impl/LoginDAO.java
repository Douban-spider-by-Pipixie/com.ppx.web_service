package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDao;
import com.ppx.web_service.dao.IBasicDAO;
import com.ppx.web_service.entity.Login;

import java.io.Serializable;
import java.util.List;

public class LoginDAO extends BasicDao<Login> implements IBasicDAO<Login> {

	public LoginDAO() {
		super();
	}

	public int login(String name,String password){
		List<Login> users = query("FROM Login WHERE name='"+name+"' AND password='"+password+"'");
		if(users.size() == 0){
			return -1;
		}else {
			return users.get(0).getId();
		}
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
	public List<Login> query(String hql) {
		return super.query(hql);
	}

	@Override
	public void insert(Object o) {
		super.insert(o);
	}

	@Override
	public void delete(Object o) {
		super.delete(o);
	}

	@Override
	public void update(Object o) {
		super.update(o);
	}

	@Override
	public void insertOrUpdate(Object o) {
		super.insertOrUpdate(o);
	}
}
