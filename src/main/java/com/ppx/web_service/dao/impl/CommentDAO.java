package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDao;
import com.ppx.web_service.entity.Comment;

import java.io.Serializable;
import java.util.List;

public class CommentDAO extends BasicDao<Comment> {

	public CommentDAO() {
		super();
	}

	@Override
	public Comment get(Serializable id) {
		return super.get(id);
	}

	@Override
	public List<Comment> getAll() {
		return super.getAll();
	}

	@Override
	public List<Comment> find(String hql) {
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
