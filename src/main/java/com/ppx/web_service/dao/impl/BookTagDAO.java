package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDAO;
import com.ppx.web_service.dao.IBasicDAO;
import com.ppx.web_service.entity.BookTag;

import java.io.Serializable;
import java.util.List;

public class BookTagDAO extends BasicDAO<BookTag> implements IBasicDAO<BookTag> {
	public List<BookTag> getTagByID(Serializable id){
		List<BookTag> bookTags = this.query("FROM BookTag WHERE bookID='"+id+"'");
		return bookTags;
	}
}
