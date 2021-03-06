package com.ppx.web_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "commenttable_Asyn")
public class Comment implements Serializable {
	@Column(name = "book_id")
	private String bookID;

	@Column(name = "cuser")
	private String user;

	@Column(name = "cdate")
	private String date;

	@Id
	@Column(name = "comment")
	private String comment;

	@Column(name = "cuserful")
	private Integer useful;

	@Column(name = "cstar")
	private String start;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getUseful() {
		return useful;
	}

	public void setUseful(Integer useful) {
		this.useful = useful;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}
}
