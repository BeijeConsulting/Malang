package it.beije.malang.database;


import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		
	String hql = "SELECT c FROM Contatto as c";
		Query<Contatto> query = session.createQuery(hql);
	for (Contatto contatto : query.list()) {
		System.out.println("id : " + contatto.getId());
		System.out.println("nome : " + contatto.getNome());
		System.out.println("cognome : " + contatto.getCognome());
		System.out.println("telefono : " + contatto.getTelefono());
		System.out.println("email : " + contatto.getEmail());
		}
		
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Contatto.class);
		@SuppressWarnings("unchecked")
		List<Contatto> Contatti = criteria.add(Restrictions.eq("cognome", "Agostini")).list();
		@SuppressWarnings("rawtypes")
		
		


		

		
		
		Iterator itr = Contatti.iterator();		
		while (itr.hasNext()) {
//			Transaction transaction = session.beginTransaction();
			Contatto contatto = (Contatto) itr.next();
			System.out.println(contatto.getId());
			System.out.println(contatto.getCognome());
		
		}
		session.close();
		factory.close();
		System.out.println("is open?" + factory.isOpen());
	
	}
}
