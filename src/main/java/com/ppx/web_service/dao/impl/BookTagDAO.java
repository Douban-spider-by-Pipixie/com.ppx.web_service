package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDao;
import com.ppx.web_service.entity.BookTag;

import java.io.Serializable;
import java.util.List;

public class BookTagDAO extends BasicDao<BookTag> {
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
	public List<BookTag> find(String hql) {
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
