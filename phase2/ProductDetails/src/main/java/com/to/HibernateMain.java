package com.to;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.control.Player;

public class HibernateMain {
	
	public static void main(String[] args) {
		try {
		Configuration con=new Configuration().configure();
		con.addAnnotatedClass(com.control.Player.class);
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory factory=con.buildSessionFactory(builder.build());
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Player p1=new Player(10,"Madhu","India",21);
		Player p2=new Player(20,"Veeresh","India",18);
		Player p3=new Player(30,"Hari","India",22);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		transaction.commit();
		session.close();
		
		System.out.println("new players sucessfully inserted ");
		

		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

}
