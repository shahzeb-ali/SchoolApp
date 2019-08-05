package com.myschool.demoApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration con = new Configuration();
       SessionFactory sef = con.buildSessionFactory();
       @SuppressWarnings("unused")
	Session session = sef.openSession();
       
       
    } 
}
