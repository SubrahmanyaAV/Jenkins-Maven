package com.cruds.SHcheck;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SpringHibernateCheck {
	
	@Autowired
	SessionFactory sf;
	
	public boolean create()
	{
		Session session = sf.openSession();
		System.out.println("Spring Hibernate Integration Success");
		
		return true;
	}


}
