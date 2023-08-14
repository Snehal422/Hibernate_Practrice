package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession(); 
		Student st=new Student();
		st.setName("snehal");
		
		s.save(st);
		s.beginTransaction().commit();
		
		
	}

}

//
//
//Configuration cfg=new Configuration().configure();
//ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
//SessionFactory factory=cfg.buildSessionFactory(registry);
//Session session=factory.openSession();
//User user=(User) session.get(User.class, 1);
//System.out.println(user);
