package com.callentry.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.callentry.model.User;
import com.callentry.persistence.HibernateUtil;

public class UserService {

	public static User saveOrUpdate(User user) {

		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(user);
		transaction.commit();
		return user;
	}

	public static User getUser(String userId) {
		Session session = HibernateUtil.getCurrentSession();
		session.beginTransaction();
		User user = (User) session.get(User.class, userId);
		session.getTransaction().commit();
		return user;
	}

	public static User getByUserName(String userName) {
		Session session = HibernateUtil.getCurrentSession();
		session.beginTransaction();
		User user = (User) session
				.createQuery("select u from User u where u.userName = :userName")
				.setParameter("userName", userName).uniqueResult(); 
		// Eager fetch the collection so we can use it detached
		session.getTransaction().commit();
		return user;
	}

	@SuppressWarnings("unchecked")
	public static List<User> getAll() {
		Session session = HibernateUtil.getCurrentSession();
		session.beginTransaction();
		List<User> result = session.createQuery("from User").list();
		session.getTransaction().commit();
		return result;
	}

}
