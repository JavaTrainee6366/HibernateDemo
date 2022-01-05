package com.map;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
		
		Question Q1 = new Question();
		Q1.setQues("What is Python");
		Answer ans = new Answer();
		ans.setAnswer("Python is programming Language");
		Q1.setAns(ans);
		
		
		
		Session session =  factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(ans);
		session.save(Q1);
        
		tx.commit();
		
		Question ques = (Question) session.load(Question.class, 5);
		System.out.println(ques.getQues());
		System.out.println(ques.getAns().getAnswer());
        
        session.close();
        factory.close();
	}

}
