package com.xworkz.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.dto.CollegeDTO;

public class CollegeDAO 
{
public void save(CollegeDTO dto)
{
	Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory sf = cfg.buildSessionFactory();
    Session ses = sf.openSession();
    Transaction tx = ses.beginTransaction();
    ses.save(dto);
    System.out.println("Data added successfully");
    tx.commit();
    ses.close();
    sf.close();
    
}
}
