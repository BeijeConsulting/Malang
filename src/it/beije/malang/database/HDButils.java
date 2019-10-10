package it.beije.malang.database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import it.beije.malang.Contatto;


public class HDButils {
	
	public static void main(String argv[]) throws Exception {
		
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		System.out.println("is open?" + factory.isOpen());
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
//		

//	String hql = "SELECT c FROM Contatto as c";
//		Query<Contatto> query = session.createQuery(hql);
//	for (Contatto contatto : query.list()) {
//		System.out.println("id : " + contatto.getId());
//		System.out.println("nome : " + contatto.getNome());
//		System.out.println("cognome : " + contatto.getCognome());
//		System.out.println("telefono : " + contatto.getTelefono());
//		System.out.println("email : " + contatto.getEmail());
//		}

//		String hql = "SELECT c FROM Contatto as c";
//		Query<Contatto> query = session.createQuery(hql);
//		for (Contatto contatto : query.list()) {
//			System.out.println("id : " + contatto.getId());
//			System.out.println("nome : " + contatto.getNome());
//			System.out.println("cognome : " + contatto.getCognome());
//			System.out.println("telefono : " + contatto.getTelefono());
//			System.out.println("email : " + contatto.getEmail());
//		}

		

//		@SuppressWarnings("deprecation")
//		Criteria criteria = session.createCriteria(Contatto.class);
//		@SuppressWarnings("unchecked")
//		List<Contatto> Contatti = criteria.add(Restrictions.eq("cognome", "Agostini")).list();
//		@SuppressWarnings("rawtypes")
		
		


		

		
//		
//		Iterator itr = Contatti.iterator();		
//		while (itr.hasNext()) {
////			Transaction transaction = session.beginTransaction();
//			Contatto contatto = (Contatto) itr.next();
//			System.out.println(contatto.getId());
//			System.out.println(contatto.getCognome());
//		
//		}

//		Criteria criteria = session.createCriteria(Contatto.class);
//		List<Contatto> contatti = criteria.list();//.add(Restrictions.eq("nome", "pippo"))
//
//		for (Contatto contatto : contatti) {
//			System.out.println("id : " + contatto.getId());
//			System.out.println("nome : " + contatto.getNome());
//			System.out.println("cognome : " + contatto.getCognome());
//			System.out.println("telefono : " + contatto.getTelefono());
//			System.out.println("email : " + contatto.getEmail());
//			
//			if (contatto.getNome().equals("Giuseppe")) {
//				contatto.setCognome("Rossi");
//			}
//		}

		
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");

//	    SessionFactory factory = cfg.buildSessionFactory();
//	    Session session = factory.openSession();

	   File file = new File("C:/Users/Padawan06/Desktop/csvconhibernate.txt"); 

	    FileWriter fw = new FileWriter(file);
	    BufferedWriter bw = new BufferedWriter(fw);


	    Query qry = session.createQuery("SELECT c FROM Contatto as c");
	    List l =(List) qry.list();
	    System.out.println("Total Number Of Records : "+((java.util.List) l).size());
	    Iterator it = ((java.util.List) l).iterator();

//	    while(it.hasNext())
//	    {
//	        Object o = (Object)it.next();
//	        Employee_details e = (Employee_details)o;
//	        System.out.println("Employee ID : "+e.getId());
//	        System.out.println("Employee Name : "+e.getName());
//	        System.out.println("Employee Salary : "+ e.getSalary());
//	        System.out.println("----------------------");
//	        bw.write(e.getId());
	        
	        
			Criteria criteria = session.createCriteria(Contatto.class);
			List<Contatto> contatti = criteria.list();//.add(Restrictions.eq("nome", "pippo"))
	        
			for (Contatto contatto : contatti) {
			System.out.println("id : " + contatto.getId());
			System.out.println("nome : " + contatto.getNome());
			System.out.println("cognome : " + contatto.getCognome());
			System.out.println("telefono : " + contatto.getTelefono());
			System.out.println("email : " + contatto.getEmail());
			
			
			if (contatto.getNome().equals("Giuseppe")) {
				contatto.setCognome("Rossi");
			}
		}
	        
	        // Here instead of Id some junk value is getting inserted
	      
	    bw.flush();
	    bw.close();

	    
	    
		session.close();
		factory.close();
		System.out.println("is open?" + factory.isOpen());
	    
	    }
	
		
		
		
		
		
//		Contatto contatto = new Contatto();
//		contatto.setNome("Fiorenza");
//		contatto.setCognome("Riccio");
//		contatto.setEmail("fiore@riccio.it");
//		contatto.setTelefono("34556616");
//
//		
//		System.out.println("id : " + contatto.getId());
//		session.save(contatto);
//		System.out.println("id : " + contatto.getId());
		
		
		
//		transaction.commit();

	
		
		
	}

