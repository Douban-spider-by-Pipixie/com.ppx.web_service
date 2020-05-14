package com.ppx.web_service.entity;

import java.io.Serializable;

public class BookTagKey implements Serializable {
	private String bookID;
	private String tagName;

	public BookTagKey() {
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BookTagKey) {
			BookTagKey key = (BookTagKey) obj;
			if (this.bookID == key.bookID && this.tagName == key.tagName) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

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
