package com.ppx.web_service.entity;

import java.io.Serializable;

public class UserViewTimeKey implements Serializable {
	private int id;
	private String tagName;

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof UserViewTimeKey){
			UserViewTimeKey key = (UserViewTimeKey)obj;
			if(this.id == key.id && this.tagName == key.tagName){
				return true;
			}
		}
		return false;
	}

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
}
