package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDAO;
import com.ppx.web_service.dao.IBasicDAO;
import com.ppx.web_service.entity.Tag;

import java.util.ArrayList;
import java.util.List;

public class TagDAO extends BasicDAO<Tag> implements IBasicDAO<Tag> {

	public List<String> getHotTag() {
		List<Tag> hotTag = query("FROM Tag WHERE isHot = true");
		List<String> nameList = new ArrayList<>();
		for (Tag t : hotTag) {
			nameList.add(t.getName());
		}
		return nameList;
	}
}
