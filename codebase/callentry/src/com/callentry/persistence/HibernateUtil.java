package com.callentry.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration configuration;
	private static SessionFactory factory;

	private static ThreadLocal<Session> session = new ThreadLocal<Session>();

	static {
		System.out.println("HibernateUtil Initialized");
		configuration = new Configuration();
		configuration.configure();
		System.out.println("HibernateUtil :: configured");
		factory = configuration.buildSessionFactory();
		System.out.println("HibernateUtil got the factory...");

	}

	public static Session getCurrentSession() {
		// return factory.getCurrentSession();
		if (session == null) {
			session = new ThreadLocal<Session>();
		}

		Session rv = session.get();
		if (rv == null || !rv.isOpen()) {
			rv = factory.openSession();
			session.set(rv);
		}

		// System.out.println("HibernateUtil:: getCurrentSession => " +
		// session);
		// logger.info("HibernateUtil:: getCurrentSession => " + session);
		return rv;
	}

	public static void closeCurrentSession() {
		Session s = session.get();

		if (s != null) {
			s.close();
			session.set(null);
		}
	}
}
