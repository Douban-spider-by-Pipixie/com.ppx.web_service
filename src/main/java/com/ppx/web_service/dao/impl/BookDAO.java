package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDao;
import com.ppx.web_service.entity.Book;

import java.io.Serializable;
import java.util.List;

public class BookDAO extends BasicDao<Book> {

	public BookDAO() {
		super();
	}

	@Override
	public Book get(Serializable id) {
		return super.get(id);
	}

	@Override
	public List<Book> getAll() {
		return super.getAll();
	}

	@Override
	public List<Book> find(String hql) {
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
