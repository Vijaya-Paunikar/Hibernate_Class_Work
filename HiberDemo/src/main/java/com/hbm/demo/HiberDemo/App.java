package com.hbm.demo.HiberDemo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
       	cfg.configure("hibernate.cfg.xml");
   		SessionFactory factory=cfg.buildSessionFactory();
   		Session session =factory.openSession();
   		Transaction tx=session.beginTransaction();
       
   		Song song1=new Song();
   		song1.setSongid(2);
   		song1.setSongName("Rim Zim Barse Savan");
   		song1.setSinger("Kishor Kumar");
       
   		session.save(song1);
		tx.commit();
		session.close();
    }
}
