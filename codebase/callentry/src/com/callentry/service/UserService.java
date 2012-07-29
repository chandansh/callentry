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
		return null;
	}

	public static User getByUserName(String userName) {
		return null;
	}

	public static List<User> getAll() {
		return null;
	}

}
