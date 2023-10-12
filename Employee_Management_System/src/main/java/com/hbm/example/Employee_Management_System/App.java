/*
 WAP to create Entity class and store the corresponding object in database using hibernate for assigned project.
 */

/*
 * This program demonstrates the creation of an Entity class (Employee) and the storage of its corresponding object in the database using Hibernate.
 */

// Package is Created
package com.hbm.example.Employee_Management_System;


// Importing necessary files
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App
{
    public static void main( String[] args )
    {
    	// Create a configuration object and load Hibernate configuration from hibernate.cfg.xml
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	// Create a session factory based on the configuration
   		SessionFactory factory=cfg.buildSessionFactory();
   		
   		// Open a new session
   		Session session =factory.openSession();
   		
   		// Begin a transaction
   		Transaction tx=session.beginTransaction();
    	
   		// Create a new Car object and set its attributes
        Employee emp=new Employee();
        
        // Setting Car attributes to object
        emp.setEmpId(201);
        emp.setEmpName("Sameer");
        emp.setDepartment("Infrastructure");
        emp.setSalary(70000.00);
        emp.setPosition("Developer");
        emp.setContact("9875457420");
        // Save the Car object to the database
        session.save(emp);
        
        // Commit the transaction to make the changes permanent
		tx.commit();
		
		// Close the session
		session.close();
    }
}