package com.hbm.demo.AnnotationsDemo1;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hbm.demo.AnnotationsDemo1.Car1;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
   		SessionFactory factory=cfg.buildSessionFactory();
   		Session session =factory.openSession();
   		Transaction tx=session.beginTransaction();
    	
        Car1 car=new Car1();
        car.setId(03);
        car.setCarName("Honda");
        car.setCost(2000000.56);
        session.save(car);
		tx.commit();
		
		session.close();
    }
}
