package com.deloitte.javatraining.entity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import  java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(2, "9", "9", "9");
		//Load hibernate connection
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		//For creating a session, first a factory then create session
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		session.save(customer);

		//select * 
		org.hibernate.Query query = session.createQuery("from com.deloitte.javatraining.entity.Customer");
		Iterator<Customer> i = query.iterate();		 
		System.out.println("SELECT *");
		while (i.hasNext()) {
			Customer customer2 = i.next();
			System.out.println(customer2);
		}

		//select * where
		Criteria criteria = session.createCriteria(Customer.class)
				.add(Restrictions.like("customerName", "9%"))
				.add(Restrictions.between("customerId", 0, 10));
		List<Customer> customers = criteria.list();
		i = customers.iterator();
		System.out.println("SELECT * FROM");
		while (i.hasNext()) {
			Customer customer2 = i.next();
			System.out.println(customer2);
		}
		
		session.close();
		factory.close();

		System.out.println("Done.");
	}
}
