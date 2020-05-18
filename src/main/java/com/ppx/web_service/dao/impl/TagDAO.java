package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDao;
import com.ppx.web_service.dao.IBasicDAO;
import com.ppx.web_service.entity.Tag;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TagDAO extends BasicDao<Tag> implements IBasicDAO<Tag> {

	public TagDAO() {
		super();
	}

	public List<String> getHotTag(){
		List<Tag> hotTag = query("FROM Tag WHERE isHot = true");
		List<String> nameList = new ArrayList<>();
		for(Tag t:hotTag){
			nameList.add(t.getName());
		}
		return nameList;
	}

	@Override
	public Tag get(Serializable id) {
		return super.get(id);
	}

	@Override
	public List<Tag> getAll() {
		return super.getAll();
	}

	@Override
	public List<Tag> query(String hql) {
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
