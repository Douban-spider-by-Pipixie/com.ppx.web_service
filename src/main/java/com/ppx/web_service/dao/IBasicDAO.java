package com.ppx.web_service.dao;

import java.io.Serializable;
import java.util.List;

// Hibernate 操作数据库的基本方法接口（增删改查）
public interface IBasicDAO<T> {
	//查询：根据ID获得对应的对象
	T get(Serializable id);

	//查询：直接获得对应表的全部对象的列表
	List<T> getAll();

	//查询：根据HQL语句获得符合条件的对象的列表
	List<T> query(String hql);

	//增加：持久化操作，插入数据库
	void insert(Object o);

	//删除：持久化操作，删除某条记录
	void delete(Object o);

	//更新：持久化操作，更新某条记录
	void update(Object o);

	//插入或更新: 持久化操作，更新该Object，若没有该Object的ID就插入
	void insertOrUpdate(Object o);
}
