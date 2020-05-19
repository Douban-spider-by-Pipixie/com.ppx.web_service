package com.ppx.web_service.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "login")
public class Login implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "user_name", unique = true)
	private String name;

	@Column(name = "user_pwd")
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
