package com.map;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BidirectionalMapDemo {
	
	public static void main(String[] args) {
		
		Set<Item> set = new HashSet<Item>();
		
		System.out.println("Session created");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session =  factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("Session created");
		Cart cart_obj = new Cart();	    
		
		Item obj = new Item();
		set.add(obj);
		obj.setCart(cart_obj);
		cart_obj.setItem(set);
		
		session.save(obj);
		session.save(cart_obj);
		
		tx.commit();
		session.close();
			
	}

}
