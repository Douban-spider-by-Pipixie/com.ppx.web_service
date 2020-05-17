package com.ppx.web_service.DBTest;

import com.alibaba.fastjson.JSON;
import com.ppx.web_service.dao.impl.BookDAO;
import com.ppx.web_service.entity.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DBTest {
	BookDAO bookDAO = new BookDAO();
	@Test
	public void bookDAOTest(){
		List<Book> bookList = bookDAO.getAll();
		String json = JSON.toJSONString(bookList);
		System.out.println(json);
	}
}

/*
public class DBTest {
	BookDAO bookDAO = new BookDAO();
	@Test
	public void bookDAOTest(){
		Query query = bookDAO.getQueryByHQL("FROM Book");
		System.out.println(query);
		List<Book> bookList = query.list();
		String json = JSON.toJSONString(bookList);
		System.out.println(json);
	}
}
 */

