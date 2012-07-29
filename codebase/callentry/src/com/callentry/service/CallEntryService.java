package com.callentry.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.callentry.model.CallEntry;
import com.callentry.model.User;
import com.callentry.persistence.HibernateUtil;

public class CallEntryService {

	public static CallEntry saveOrUpdate(CallEntry callEntry) {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(callEntry);
		transaction.commit();
		return callEntry;
	}

	public static CallEntry get(String id) {
		Session session = HibernateUtil.getCurrentSession();
		session.beginTransaction();
		CallEntry callEntry = (CallEntry) session.get(User.class, id);
		session.getTransaction().commit();
		return callEntry;
	}

	@SuppressWarnings("unchecked")
	public static List<CallEntry> getByUser(String userId) {
		Session session = HibernateUtil.getCurrentSession();
		session.beginTransaction();
		List<CallEntry> callEntry = (List<CallEntry>) session
				.createQuery(
						"select e from CallEntry e where e.userId = :userId")
				.setParameter("userId", userId).list();
		// Eager fetch the collection so we can use it detached
		session.getTransaction().commit();
		return callEntry;
	}

	@SuppressWarnings("unchecked")
	public static List<CallEntry> getAll() {
		Session session = HibernateUtil.getCurrentSession();
		session.beginTransaction();
		List<CallEntry> result = session.createQuery("from CallEntry").list();
		session.getTransaction().commit();
		return result;
	}
}
