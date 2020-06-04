package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDAO;
import com.ppx.web_service.dao.IBasicDAO;
import com.ppx.web_service.entity.Book;

import java.util.List;
import java.util.Set;

public class BookDAO extends BasicDAO<Book> implements IBasicDAO<Book> {
	public List<Book> getBooksByIDSet(Set<String> idSet){
		return new BookDAO().query(("FROM Book WHERE id IN "+idSet+"").replace("[","(").replace("]",")"));
	}
}
