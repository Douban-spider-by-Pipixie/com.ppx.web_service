package com.ppx.web_service.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public abstract class BasicDAO {

	private static SessionFactory sessionFactory = null;
	private static Transaction tx = null;

	public BasicDAO(){
		makeConnect();
	}

	private void makeConnect(){
		try {
			Configuration config = new Configuration().configure();
			sessionFactory = config.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//增
	public boolean insert(Object o){
		try{
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			int id = (int)session.save(o);
			tx.commit();
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	//删
	public boolean delete(Object o){
		try{
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.delete(o);
			tx.commit();
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	//改
	public boolean update(Object o){
		try{
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(o);
			tx.commit();
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	//查
	Query getQueryByHQL(String hql){
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Query q = session.createQuery(hql);
		tx.commit();
		return q;
	}
}
