package com.ppx.web_service.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_tag")
@IdClass(BookTagKey.class)
public class BookTag {
	/*
	联合主键
	 */
	@Id
	@Column(name = "book_id")
	private String bookID;

	@Id
	@Column(name = "tag_name")
	private String tagName;

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
}
