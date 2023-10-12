//Q.1)Create student and  Course Entity to show one to Many and Many to one mapping
package com.hbm.Student.HiberStudentCourse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Course;
import com.Entity.Student;
import com.Utility.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        
        try
        {
        	Course course=new Course();
        	course.setName("Biology");
        	
        	Student student1=new Student();
        	student1.setName("Pratiksha");
        	student1.setCourse(course);
        	
        	Student student2=new Student();
        	student2.setName("Revansh");
        	student2.setCourse(course);
        	
        	course.getStudent().add(student1);
        	course.getStudent().add(student2);
        	session.beginTransaction();
        	session.save(course);
        	session.getTransaction().commit();	
        	
        }
        finally
        {
        	session.close();
        	sessionFactory.close();
        }
    }
}
