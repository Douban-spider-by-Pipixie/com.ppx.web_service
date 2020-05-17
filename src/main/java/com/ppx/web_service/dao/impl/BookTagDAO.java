package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDao;
import com.ppx.web_service.dao.IBasicDAO;
import com.ppx.web_service.entity.BookTag;

import java.io.Serializable;
import java.util.List;

public class BookTagDAO extends BasicDao<BookTag> implements IBasicDAO<BookTag> {
	public BookTagDAO() {
		super();
	}

	@Override
	public BookTag get(Serializable id) {
		return super.get(id);
	}

	@Override
	public List<BookTag> getAll() {
		return super.getAll();
	}

	@Override
	public List<BookTag> query(String hql) {
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
