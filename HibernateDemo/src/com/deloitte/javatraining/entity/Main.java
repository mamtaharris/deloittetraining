package com.deloitte.javatraining.entity;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		 Customer customer = new Customer(1, "9", "9", 9);
		 //Load hibernate connection
		 Configuration configuration = new Configuration().configure();
		 //For creating a session, first a factory then create session
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session session = factory.openSession();
		 //Start the transaction. Auto-update. Synchronization.
		 Transaction transaction = session.beginTransaction();
		 
		 session.save(customer);
		 transaction.commit();
		 System.out.println("Inserted.");
		 
		 session.delete(customer);
		 transaction.commit();
		 System.out.println("Deleted.");

		 session.load(Customer.class, 1);
		 
		 session.close();
		 factory.close();
		 
		 System.out.println("Done.");
	}
}
