package com.ppx.web_service.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.ppx.web_service.dao.impl.BookDAO;
import com.ppx.web_service.dao.impl.BookDetailDAO;
import com.ppx.web_service.dao.impl.TagDAO;
import com.ppx.web_service.entity.Book;
import com.ppx.web_service.entity.BookDetail;
import com.ppx.web_service.service.IUserService;

import java.util.*;

public class UserService implements IUserService {
	@Override
	public String showRandomBooks(int n) {
		BookDAO bookDAO = new BookDAO();
		List<Book> bookList = bookDAO.getAll();
		List<Book> showBook = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			int j = random.nextInt(bookList.size());
			showBook.add(bookList.get(j));
		}
		return JSONArray.toJSONString(showBook);
	}

	@Override
	public String showHotBooks(int n) {
		TagDAO tagDAO = new TagDAO();
		List<String> hotTag = tagDAO.getHotTag();
		return JSONArray.toJSONString(hotTag);
	}

	@Override
	public Set<String> search(String s) {
		String detailHQL = "FROM BookDetail WHERE book_introduct like '%" + s + "%'";
		String nameHQL = "FROM Book WHERE name like '%" + s + "%'";
		List<Book> bookList = new BookDAO().query(nameHQL);
		List<BookDetail> bookDetailList = new BookDetailDAO().query(detailHQL);
		Set<String> idSet = new HashSet<>();
		for(Book b:bookList){
			idSet.add(b.getId());
		}
		for(BookDetail bd:bookDetailList){
			idSet.add(bd.getId());
		}
		return idSet;
	}
}
