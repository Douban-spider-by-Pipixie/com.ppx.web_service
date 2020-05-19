package com.ppx.web_service.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tag_Asyn")
public class Tag implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "tag_name")
	private String name;

	@Column(name = "tag_isHot")
	private Boolean isHot;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getHot() {
		return isHot;
	}

	public void setHot(Boolean hot) {
		isHot = hot;
	}
}
