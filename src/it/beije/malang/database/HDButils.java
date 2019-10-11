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

import it.beije.malang.Contatto;


public class HDButils {
	
	public static void main(String argv[]) throws Exception {
		
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		System.out.println("is open?" + factory.isOpen());
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		

//		String hql = "SELECT contatto FROM Contatto as contatto";//query=comando
//		Query<Contatto> query = session.createQuery(hql);
//		for (Contatto contatto : query.list()) {
//			System.out.println("id : " + contatto.getId());
//			System.out.println("nome : " + contatto.getNome());
//			System.out.println("cognome : " + contatto.getCognome());
//			System.out.println("telefono : " + contatto.getTelefono());
//			System.out.println("email : " + contatto.getEmail());
//		}

		//String uno = "SELECT contact FROM contact as contact";
		
		String hql = "SELECT pippo FROM Contatto as pippo";
		Query<Contatto> query = session.createQuery(hql);
		for (Contatto contatto : query.list()) {
			System.out.println("id : " + contatto.getId());
			System.out.println("nome : " + contatto.getNome());
			System.out.println("cognome : " + contatto.getCognome());
			System.out.println("telefono : " + contatto.getTelefono());
			System.out.println("email : " + contatto.getEmail());
		}

		
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
		
		Contatto contatto = new Contatto();
		contatto.setNome("Elia");
		contatto.setCognome("Toaiari");
		contatto.setEmail("eli@toax.it");
		contatto.setTelefono("34446616");
		
		session.save(contatto);

		/*String uno = "INSERT INTO rubrica (nome,cognome,email,telefono) VALUES ('"+contatto.getNome()+"','"+cognome.getCognome()+"','email.getEmail','telefono.getTelefono()')";
		Query<Contatto> query_uno = session.createQuery(uno);
		for (Contatto contattoUno : query.list()) {
			System.out.println("id : " + contatto.getId());
			System.out.println("nome : " + contatto.getNome());
			System.out.println("cognome : " + contatto.getCognome());
			System.out.println("telefono : " + contatto.getTelefono());
			System.out.println("email : " + contatto.getEmail());
		/*System.out.println("id : " + contatto.getId());
		session.save(contatto);
		System.out.println("id : " + contatto.getId());
		*/
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("is open?" + factory.isOpen());
	}
}