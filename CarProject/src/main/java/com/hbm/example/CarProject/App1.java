// Q.2)Create Car Entity class with different annotation.

// Package is Created
package com.hbm.example.CarProject;


// Importing necessary files
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App1 
{
    public static void main( String[] args )
    {
    	// Create a configuration object and load Hibernate configuration from hibernate.cfg.xml
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg1.xml");
    	
    	// Create a session factory based on the configuration
   		SessionFactory factory=cfg.buildSessionFactory();
   		
   		// Open a new session
   		Session session =factory.openSession();
   		
   		// Begin a transaction
   		Transaction tx=session.beginTransaction();
    	
   		// Create a new Car object and set its attributes
        Car car=new Car();
        
        // Setting Car attributes to object
        car.setCarId(2);           // Car ID is set to 2
        car.setBrand("Fortuner");    // Brand is set to "Fortuner"
        car.setModel("Altima");    // Model is set to "Altima"
        car.setYear(2023);         // Year is set to 2023
        car.setPrice(178000.0);     // Price is set to 780000.0
        car.setColor("Black");     // Color is set to "Black"
        car.setFuelType("Diesel"); // Fuel type is set to "Diesel"
   
        
        // Save the Car object to the database
        session.save(car);
        
        // Commit the transaction to make the changes permanent
		tx.commit();
		
		// Close the session
		session.close();
    }
}