package com.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.Entity.Employee;

public class HibernateUtil
{
	static SessionFactory factory=null;
	static {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		factory=cfg.buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFactory()
	{
		return factory;
	}
	
	public static Session getSession()
	{
		return factory.openSession();
	}
	
}
