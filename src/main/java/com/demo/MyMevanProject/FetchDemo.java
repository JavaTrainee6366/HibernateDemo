package com.demo.MyMevanProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		//get, load
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//get data
		StudentEntity stu = (StudentEntity) session.get(StudentEntity.class, 102);
		System.out.println(stu.getCity());
		
		Address add = (Address) session.load(Address.class, 1);
		System.out.println(add.getStreet());
		
		session.close();
		factory.close();
	}
}
