package com.ppx.web_service.servlet;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.ppx.web_service.dao.impl.BookDAO;
import com.ppx.web_service.dao.impl.BookTagDAO;
import com.ppx.web_service.dao.impl.TagDAO;
import com.ppx.web_service.entity.Book;
import com.ppx.web_service.entity.BookTag;
import com.ppx.web_service.entity.Tag;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "TestServlet",urlPatterns = "/test",loadOnStartup = 1)
public class TestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req.setCharacterEncoding("utf-8");
		//resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
		TagDAO TagDAO = new TagDAO();
		List<Tag> bookList = TagDAO.getAll();
		String json = JSONArray.toJSONString(bookList);
		PrintWriter pw = resp.getWriter();
		pw.write(json);
		pw.flush();
	}
}
