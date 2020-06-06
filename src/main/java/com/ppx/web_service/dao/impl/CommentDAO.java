package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDAO;
import com.ppx.web_service.dao.IBasicDAO;
import com.ppx.web_service.entity.Comment;

import java.util.List;

public class CommentDAO extends BasicDAO<Comment> implements IBasicDAO<Comment> {
	public List<Comment> getAllCommentByID(String bookid){
		return new CommentDAO().query("FROM Comment WHERE bookID=\'"+bookid+"\'");
	}

}
