package com.hbm.Student.Hiber_Practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        Library lib=new Library();
        lib.setId(137);
        lib.setName("Vijaya");
        lib.setStd(12);
        lib.setContact("7744983086");
        
        session.save(lib);
        tx.commit();
        session.close();
    }
}



