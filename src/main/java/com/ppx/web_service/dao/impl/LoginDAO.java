package com.ppx.web_service.dao.impl;

import com.ppx.web_service.dao.BasicDAO;
import com.ppx.web_service.dao.IBasicDAO;
import com.ppx.web_service.entity.Login;

import java.util.List;

public class LoginDAO extends BasicDAO<Login> implements IBasicDAO<Login> {

	public int login(String name, String password) {
		List<Login> users = query("FROM Login WHERE name='" + name + "' AND password='" + password + "'");
		if (users.size() == 0) {
			return -1;
		} else {
			return users.get(0).getId();
		}
	}

	public boolean register(String name,String password){
		Login newUser = new Login();
		List<Login> list = query("FROM Login WHERE name='" + name + "'");
		if(list.size()==0){
			newUser.setName(name);
			newUser.setPassword(password);
			insert(newUser);
			return true;
		}else {
			return false;
		}
	}
}
