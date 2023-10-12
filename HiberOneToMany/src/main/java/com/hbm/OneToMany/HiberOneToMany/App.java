package com.hbm.OneToMany.HiberOneToMany;

import com.Entity.Department;
import com.Entity.Employee;
import com.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        
        try
        {
        	Department department=new Department();
        	department.setName("Computer Science");
        	
        	Employee employee1=new Employee();
        	employee1.setName("Raghav");
        	employee1.setDepartment(department);
        	
        	Employee employee2=new Employee();
        	employee2.setName("Ram");
        	employee2.setDepartment(department);
        	
        	Employee employee3=new Employee();
        	employee3.setName("Ravi");
        	employee3.setDepartment(department);
        	
            department.getEmployee().add(employee1);
            department.getEmployee().add(employee2);
            department.getEmployee().add(employee3);
        	session.beginTransaction();
        	session.save(department);
        	session.getTransaction().commit();	
        }
        finally
        {
        	session.close();
        	sessionFactory.close();
        }
    }
}
