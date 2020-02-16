package com.yadav.HibernateCacheDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
	public static void main(String[] args) {

		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Doctor.class);
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session s1 = sf.openSession();
		Session session1 = sf.openSession();
		Doctor drObj = (Doctor) session1.load(Doctor.class, 1);
		System.out.println(drObj.getDrId() + " " + drObj.getDrName());
		session1.close();

		Session s2 = sf.openSession();
		Session session2 = sf.openSession();
		Doctor drObj1 = (Doctor) session2.load(Doctor.class, 1);
		System.out.println(drObj1.getDrId() + " " + drObj1.getDrName());
		session1.close();

		// o/p:- select doctor0_.drId as drId1_0_0_, doctor0_.drName as drName2_0_0_
		// from table_Dr doctor0_ where doctor0_.drId=?
		// 1 Nikhil
		// 1 Nikhil
	}
}
