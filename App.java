package com.hbm.demo.SongDemo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration=new Configuration();
    	configuration.configure("hibernate.cfg.xml");
       
    	SessionFactory factory=configuration.buildSessionFactory();
   	   	Session session =factory.openSession();
   	   	Transaction tx=session.beginTransaction();
    	
    	Song song1=new Song(); // object creation
        song1.setSongid(1);
        song1.setSongName("Rim zim gire Savan");
        song1.setSinger("Kishore Kumar");
        session.save(song1);
        
        tx.commit();
        session.close();
        
    }
}

