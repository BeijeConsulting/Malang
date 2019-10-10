/* Le criteria servono per costruire le query Hql dinamiche al volo in Hibernate, sia in sql che Hql
 * Con Transaction si fa l'update e l'insert direttamente sul db con criteria*/
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


public class HDButilsCriteriaTransazioni {
	
	public static void main(String argv[]) throws Exception {
		
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		System.out.println("is open?" + factory.isOpen());
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction(); //apertura di una nuova transazione, è obligatoria per fare le modifiche al db
		
//		String hql = "SELECT c FROM Contatto as c";
//		Query<Contatto> query = session.createQuery(hql);
//		for (Contatto contatto : query.list()) {
//			System.out.println("id : " + contatto.getId());
//			System.out.println("nome : " + contatto.getNome());
//			System.out.println("cognome : " + contatto.getCognome());
//			System.out.println("telefono : " + contatto.getTelefono());
//			System.out.println("email : " + contatto.getEmail());
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
		
		Contatto contatto = new Contatto();
		contatto.setNome("luigi");
		contatto.setCognome("Verdi");
		contatto.setEmail("luigi@verdi.it");
		contatto.setTelefono("3224111111");

		System.out.println("id : " + contatto.getId());
		session.save(contatto);
		System.out.println("id : " + contatto.getId());
		
		transaction.commit();//bisogna chiudere la transazione dentro la sessione
		session.close();
		factory.close();
		System.out.println("is open?" + factory.isOpen());
	}
}