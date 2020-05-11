package com.ppx.web_service.model;

import java.net.URI;
import java.util.Date;

public class Book {
	private long book_id;
	private URI book_img;
	private String book_name;
	private Float book_star;
	private Integer book_commentCount;
	private String book_author;
	private String book_publish;
	private Date book_date;
	private String book_price;

	public Book(long book_id, URI book_img, String book_name, float book_star, int book_commentCount, String book_author, String book_publish, Date book_date, String book_price) {
		this.book_id = book_id;
		this.book_img = book_img;
		this.book_name = book_name;
		this.book_star = book_star;
		this.book_commentCount = book_commentCount;
		this.book_author = book_author;
		this.book_publish = book_publish;
		this.book_date = book_date;
		this.book_price = book_price;
	}

	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public URI getBook_img() {
		return book_img;
	}

	public void setBook_img(URI book_img) {
		this.book_img = book_img;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public float getBook_star() {
		return book_star;
	}

	public void setBook_star(float book_star) {
		this.book_star = book_star;
	}

	public int getBook_commentCount() {
		return book_commentCount;
	}

	public void setBook_commentCount(int book_commentCount) {
		this.book_commentCount = book_commentCount;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public String getBook_publish() {
		return book_publish;
	}

	public void setBook_publish(String book_publish) {
		this.book_publish = book_publish;
	}

	public Date getBook_date() {
		return book_date;
	}

	public void setBook_date(Date book_date) {
		this.book_date = book_date;
	}

	public String getBook_price() {
		return book_price;
	}

	public void setBook_price(String book_price) {
		this.book_price = book_price;
	}
}
