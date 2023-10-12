//Insert Operation in Marks Table
package com.springdemo.ProjectCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Marks;
import com.utility.HibernateUtil;

public class insert 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			Marks m1=new Marks("RAJ","FIRST SEM",490,98.50);
			Marks m2=new Marks("SIMRAN","MID SEM",430,92.50);
			
			ses.save(m1);
			ses.save(m2);
			
			ses.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
