package com.springdemo.ProjectCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Marks;
import com.utility.HibernateUtil;

public class retrieve 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			Marks mark=ses.get(Marks.class,2);
			System.out.println("Marksheet with student id 1 info "+mark);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
