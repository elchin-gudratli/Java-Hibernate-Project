package com.bilgeadam.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.bilgeadam.model.Araba;
import com.bilgeadam.model.ArabaDetay;
import com.bilgeadam.util.HibernateUtil;

public class ArabaHibernateDAO {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Araba> findAll() {
	
		List<Araba> arabaListesi = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			org.hibernate.query.Query query = session.createQuery("from Araba");
			arabaListesi = query.list();
			transaction.commit();
		} catch (Exception e) {
			arabaListesi = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return arabaListesi;
	}

	@SuppressWarnings({ "rawtypes"})
	public ArabaDetay arabaDetayGetir(int id) {
		ArabaDetay arabaDetay = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			//hql 
		org.hibernate.query.Query query = session.createQuery("from arabadetay where arabaID = :id");
			query.setParameter("id", id);
			arabaDetay = (ArabaDetay) query.uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			arabaDetay = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return arabaDetay;
	}

}