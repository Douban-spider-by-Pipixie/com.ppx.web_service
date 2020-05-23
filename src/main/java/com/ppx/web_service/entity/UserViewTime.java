package com.ppx.web_service.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_view_time")
@IdClass(UserViewTimeKey.class)
public class UserViewTime {
	/*
	联合主键
	 */
	@Id
	@Column(name = "user_id")
	private int id;

	@Id
	@Column(name = "tag_name")
	private String tagName;

	@Column(name = "view_time")
	private int time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}
