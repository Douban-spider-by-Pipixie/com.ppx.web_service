package com.ppx.web_service.model;

public class BookTag {
	private long book_id;
	private String tag_name;

	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	public BookTag(long book_id, String tag_name) {
		this.book_id = book_id;
		this.tag_name = tag_name;
	}
}
