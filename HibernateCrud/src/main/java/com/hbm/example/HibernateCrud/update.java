package com.hbm.example.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.utility.HibernateUtil;

public class update 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			Employee emp=ses.get(Employee.class,2);
			emp.setEmpSal(80000.00);
			emp.setEmpDept("Admin");
		
			ses.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
}


