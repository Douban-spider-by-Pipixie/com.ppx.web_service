package com.ppx.web_service.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.ppx.web_service.dao.impl.BookDAO;
import com.ppx.web_service.dao.impl.TagDAO;
import com.ppx.web_service.entity.Book;
import com.ppx.web_service.entity.Tag;
import com.ppx.web_service.service.IUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserService implements IUserService {
	@Override
	public String showRandomBooks(int n) {
		BookDAO bookDAO = new BookDAO();
		List<Book> bookList = bookDAO.getAll();
		List<Book> showBook = new ArrayList<>();
		Random random = new Random();
		for(int i=0;i<n;i++){
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
}
