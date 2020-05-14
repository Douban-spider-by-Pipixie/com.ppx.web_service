package com.ppx.web_service.dao;

import org.hibernate.query.Query;

public class BookDAO extends BasicDAO {
	public BookDAO() {
		super();
	}

	@Override
	public boolean insert(Object o) {
		return super.insert(o);
	}

	@Override
	public boolean delete(Object o) {
		return super.delete(o);
	}

	@Override
	public boolean update(Object o) {
		return super.update(o);
	}

	@Override
	Query getQueryByHQL(String hql) {
		return super.getQueryByHQL(hql);
	}
}
