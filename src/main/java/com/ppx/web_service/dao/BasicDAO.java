package com.ppx.web_service.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/*

Hibernate 操作数据库的基本方法的泛型实现：
	函数本身为虚函数，不可直接构造；
	需要作为Impl类的父类传入ORM对应的Entity类实现；
	子类继承后即可使用该类的所有方法；

	e.g.:
		public class BookDAO extends BasicDao<Book>

*/

//重构：Extract Class 提取到类
public abstract class BasicDAO<T> implements IBasicDAO<T> {
	private final Class<T> entityClass;
	private final SessionFactory sessionFactory;
	private Transaction transaction;

	public BasicDAO(){

		// 用反射的方法获得 T.class ( T.class本身不可直接调用 )
		Type genType = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
		entityClass = (Class)params[0];

		// 获得 Hibernate
		Configuration conf = new Configuration().configure();
		sessionFactory = conf.buildSessionFactory();

	}

	@Override
	public T get(Serializable id) {
		Session session = sessionFactory.openSession();
		return session.get(entityClass,id);
	}

	@Override
	public List<T> getAll() {
		try{
			Session session = sessionFactory.openSession();
			String[] params = entityClass.getName().split("\\.");
			int size = params.length;
			String hql = "FROM "+params[size-1];
			Query query = session.createQuery(hql);
			return (List<T>) query.list();
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<T> query(String hql) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		return (List<T>)query.list();
	}

	@Override
	public void insert(Object o) {
		Session session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		session.save(o);
		transaction.commit();
	}

	@Override
	public void delete(Object o) {
		Session session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		session.delete(o);
		transaction.commit();
	}

	@Override
	public void update(Object o) {
		Session session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		session.update(o);
		transaction.commit();
	}

	@Override
	public void insertOrUpdate(Object o) {
		Session session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		session.saveOrUpdate(o);
		transaction.commit();
	}
}
