package com.myschool.demoApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.internal.SessionFactoryOptionsBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		personBean person = new personBean();
		person.setFirstName("testFirstName");
		person.setLastName("testLastName");
		person.setAddress("tannenbusch mitte");
		person.setPersonID(102);
		person.setPhoneNr(123453432);
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(personBean.class);
		
		SessionFactory sef = con.buildSessionFactory();

		Session session = sef.openSession();
		Transaction t = session.beginTransaction();

		session.save(person);
		t.commit();
	}
}
