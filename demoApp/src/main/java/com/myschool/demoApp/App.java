package com.myschool.demoApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		dbs_tab_person person = new dbs_tab_person();
		person.setFirstName("testFirstName");
		person.setLastName("testLastName");
		person.setAddress("tannenbusch mitte");
		person.setPersonID(101);
		person.setPhoneNr(123453432);
		Configuration con = new Configuration().configure().addAnnotatedClass(dbs_tab_person.class);
		SessionFactory sef = con.buildSessionFactory();

		Session session = sef.openSession();
		Transaction t = session.beginTransaction();

		session.save(person);
		t.commit();
	}
}
