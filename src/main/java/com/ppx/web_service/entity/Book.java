package com.ppx.web_service.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_Asyn")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private String id;

	@Column(name = "book_img")
	private String img;

	@Column(name = "book_name")
	private String name;

	@Column(name = "book_star")
	private Float star;

	@Column(name = "book_commentCount")
	private Integer commentCount;

	@Column(name = "book_author")
	private String author;

	@Column(name = "book_publish")
	private String publish;

	//@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "book_date")
	private String date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getStar() {
		return star;
	}

	public void setStar(Float star) {
		this.star = star;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	private String price;
}
