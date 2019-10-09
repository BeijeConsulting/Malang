package it.beije.malang.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import it.beije.malang.Contatto;


public class HDButils {
	
	public static void main(String argv[]) throws Exception {
		
		Configuration configuration = new Configuration();
		configuration = configuration.configure().setProperty("hibernate.show_sql", "false");;
		
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
		
		session.close();
		factory.close();
		System.out.println("is open?" + factory.isOpen());
	}
}