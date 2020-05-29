package com.ppx.web_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_detail")
public class BookDetail {
	@Id
	@Column(name = "book_id")
	private String id;

	@Column(name = "book_introduct")
	private String bookIntroduction;

	@Column(name = "table")
	private String table;

	@Column(name = "author_introduct")
	private String authorIntroduction;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookIntroduction() {
		return bookIntroduction;
	}

	public void setBookIntroduction(String bookIntroduction) {
		this.bookIntroduction = bookIntroduction;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getAuthorIntroduction() {
		return authorIntroduction;
	}

	public void setAuthorIntroduction(String authorIntroduction) {
		this.authorIntroduction = authorIntroduction;
	}
}
