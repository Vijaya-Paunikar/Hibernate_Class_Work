/*
 WAP to create Entity class and store the corresponding object in database using hibernate for assigned project.
 */

/*
 * This program demonstrates the creation of an Entity class (Marksheet) and the storage of its corresponding object in the database using Hibernate.
 */

package com.hbm.example.MarksheetGenerationSystem;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
    	// Create a Hibernate configuration object
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	// Build a session factory based on the configuration
   		SessionFactory factory=cfg.buildSessionFactory();
   		
   		// Open a new session
   		Session session =factory.openSession();
   		
   		// Begin a transaction
   		Transaction tx=session.beginTransaction();
    	
   		// Create a new Marksheet object and set its attributes
        Marksheet obj=new Marksheet();
        obj.setMarksheetid(103);
        obj.setStudentid(3);
        obj.setStudname("Sam");
        obj.setCourseid(2004);
        obj.setExamname("Mid Semester Exam");
        obj.setExamtype("Summer");
        obj.setSub1score(80);
        obj.setSub2score(80);
        obj.setSub3score(90);
        obj.setSub4score(70);
        obj.setSub5score(90);
        obj.setTotalmarksobtained(410);
        obj.setTotalmarks(500);
        obj.setPercentage(81);
        obj.setGrade('A');
        
        // Save the Marksheet object to the database
        session.save(obj);
        
        // Commit the transaction to make the changes permanent
		tx.commit();
		
		// Close the session
		session.close();
    }
}