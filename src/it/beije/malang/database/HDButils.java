package it.beije.malang.database;
import java.util.*;
import java.util.function.*;

import java.util.Iterator;
import java.util.List;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Metamodel;
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
		
		
		//non si può utilizzare *; Per selezionare tutto bisogna fare la SELECT *nome_tabella*
		
//		String hql = "SELECT c FROM Contatto as c";
//		Query<Contatto> query = session.createQuery(hql);
//		for (Contatto contatto : query.list()) {
//			System.out.println("id : " + contatto.getId());
//			System.out.println("nome : " + contatto.getNome());
//			System.out.println("cognome : " + contatto.getCognome());
//			System.out.println("telefono : " + contatto.getTelefono());
//			System.out.println("email : " + contatto.getEmail());
//		}

		
		// * NUOVO METODO DA USARE PER CRITERIA, VISTO CHE CREATE CRITERIA E' DEPRECATO *
//		CriteriaQuery<Contatto> cB = session.getCriteriaBuilder().createQuery(Contatto.class);
//		
//		List<Contatto> contatti = session.createQuery(cB).getResultList();
		
		
		
		// *QUERY COMPLESSA SENZA CREATECRITERIA *
//		CriteriaBuilder cb = session.getCriteriaBuilder();
//		CriteriaQuery<Contatto> cr = cb.createQuery(Contatto.class);
//		Root<Contatto> root = cr.from(Contatto.class);
//		Predicate condition =  cb.equal(root.get("nome"), "letizia");
//		
//		cr.select(root).where(condition);
//	
//		List<Contatto> c = session.createQuery(cr).list();
//		for(Contatto contatto : c)
//			System.out.println(contatto.getNome());
//		
//		
		
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
//		
//		Contatto contatto = new Contatto();
//		contatto.setNome("Fiorenza");
//		contatto.setCognome("Riccio");
//		contatto.setEmail("fiore@riccio.it");
//		contatto.setTelefono("34556616");
//
//		System.out.println("id : " + contatto.getId());
//		session.save(contatto);
//		System.out.println("id : " + contatto.getId());
//		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("is open?" + factory.isOpen());
	}
}