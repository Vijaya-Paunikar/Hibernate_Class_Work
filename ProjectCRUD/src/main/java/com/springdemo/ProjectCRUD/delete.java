//Delete Operation in Marks Table
package com.springdemo.ProjectCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Marks;
import com.utility.HibernateUtil;

public class delete {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			Marks mark=ses.get(Marks.class,3);
			ses.delete(mark);
			
			ses.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
