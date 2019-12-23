package it.beije.malang.database;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import it.beije.malang.database.entities.Contatto;
import it.beije.malang.database.entities.Indirizzo;
import it.beije.malang.database.entities.Utente;


public class HDButils {
	
	public static void main(String argv[]) throws Exception {
		
		Configuration configuration = new Configuration();
		configuration = configuration.configure()
				.addAnnotatedClass(Contatto.class)
				.addAnnotatedClass(Utente.class)
				.addAnnotatedClass(Indirizzo.class);
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		System.out.println("is open?" + factory.isOpen());
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		String hql = "SELECT c FROM Contatto as c";
//		Query<Contatto> query = session.createQuery(hql);
//		for (Contatto contatto : query.list()) {
//			System.out.println("id : " + contatto.getId());
//			System.out.println("nome : " + contatto.getNome());
//			System.out.println("cognome : " + contatto.getCognome());
//			System.out.println("telefono : " + contatto.getTelefono());
//			System.out.println("email : " + contatto.getEmail());
//		}
		
	//Criteria criteria = session.createCriteria(Contatto.class);
	//criteria.add(Restrictions.eq("nome", "Steve"));
	//List<Contatto> contatti = criteria.list();
	
	Criteria criteria = session.createCriteria(Contatto.class);
	criteria.add(Restrictions.eq("cognome", "totti"));
	List<Contatto> contatti = criteria.list();
	
	

	for (Contatto contatto : contatti) {
		System.out.println("id : " + contatto.getId());
		System.out.println("nome : " + contatto.getNome());
		System.out.println("cognome : " + contatto.getCognome());
		System.out.println("telefono : " + contatto.getTelefono());
		System.out.println("email : " + contatto.getEmail());
		
			if (contatto.getNome().equals("Steve")) {
			contatto.setCognome("Cardinal");
			}
	}
		
		
		
		  Contatto contatto = new Contatto(); contatto.setNome("fra");
		  contatto.setCognome("Riccio"); contatto.setEmail("fiore@riccio.it");
		  contatto.setTelefono("34556616");
		  
		  //Contatto contatto = new Contatto(); contatto.setNome("Geltrude");
		  contatto.setCognome("Derossi"); contatto.setEmail("geltrude@riccio.it");
		  contatto.setTelefono("320145789");
		 
		  
		  System.out.println("id : " + contatto.getId()); session.save(contatto);
		  System.out.println("id : " + contatto.getId());
		 
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("is open?" + factory.isOpen());
	}
}