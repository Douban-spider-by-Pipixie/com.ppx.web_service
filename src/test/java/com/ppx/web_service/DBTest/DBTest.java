package com.ppx.web_service.DBTest;

import com.ppx.web_service.dao.BookDAO;
import com.ppx.web_service.entity.Book;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;

import java.util.List;


public class DBTest {
	BookDAO bookDAO = new BookDAO();
	@Test
	public void bookDAOTest(){
		Query query = bookDAO.getQueryByHQL("FROM Book");
		System.out.println(query);
		List<Book> bookList = query.list();
		for (Book b:bookList) {
			System.out.println(b);
		}
	}
}
