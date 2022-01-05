package com.hql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.MyMevanProject.StudentEntity;

public class HqlExample {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//HQL: Fetch data
		
		//String query = "from StudentEntity";
		String query = "from StudentEntity where city=:x";
		
		Session session = factory.openSession();
		
		Query q = session.createQuery(query);
		q.setParameter("x", "Mohali");// can pass values using this approach for security perpose
		//sigle result-- Unique
		//multiple result -- list
		
		List<StudentEntity> stu =	q.getResultList();
		
		for(StudentEntity st : stu) {
			System.out.println(st.getName());
		}
		
		System.out.println("-----------------------------------------");
		Transaction tx = session.beginTransaction();
		Query q1 = session.createQuery("delete from StudentEntity where id=:x");
		q1.setParameter("x", 4);
		int r = q1.executeUpdate();
		System.out.println("Deleted::"+r);
		
		System.out.println("......update............");
		Query q2 = session.createQuery("update StudentEntity set city=:x where course=:x1");
		q2.setParameter("x", "Chandigarh");
		q2.setParameter("x1", "Java");
		int r1 = q2.executeUpdate();
		System.out.println("Updated::"+r1);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
