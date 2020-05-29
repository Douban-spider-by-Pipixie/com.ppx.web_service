package com.ppx.web_service.service;

public interface IUserService {
	//随机展示书本
	String showRandomBooks(int n);

	//展示热门书本
	String showHotBooks(int n);
}
