package com.hbm.example.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.utility.HibernateUtil;

public class delete 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			Employee emp=ses.get(Employee.class, 3);
			ses.delete(emp);
		
			ses.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
