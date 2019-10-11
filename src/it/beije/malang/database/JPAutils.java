package it.beije.malang.database;

import java.io.IOException;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.beije.malang.database.entities.Contatto;
import it.beije.malang.database.entities.Indirizzo;
import it.beije.malang.database.entities.Utente;


public class JPAutils {
	
	public static void main(String argv[]) throws IOException {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Malang");
		EntityManager entityManager = factory.createEntityManager();
		
		int id = 1;
		Utente u = entityManager.find(Utente.class, id);

		System.out.println("Utente : " + u.getNome());
		System.out.println("Utente indirizzi : " + u.getIndirizzi());
		for (Indirizzo i : u.getIndirizzi()) {
			System.out.println("id : " + i.getId());
			System.out.println("cap : " + i.getCap());
			System.out.println("citta : " + i.getCitta());
			System.out.println("prov : " + i.getProvincia());
		}

////		Utente u = new Utente();
////		u.setCognome("Ferulli");
////		u.setNome("Marina3");
////		u.setEmail("marina3@ferulli.it");
////		
//		Indirizzo indirizzo = new Indirizzo();
//		indirizzo.setCap("20100");
//		indirizzo.setCitta("Milano");
//		indirizzo.setProvincia("MI");
//		indirizzo.setTelefono("23224");
//						
//		entityManager.getTransaction().begin();
//
//		System.out.println("Utente id : " + u.getId());
//		entityManager.persist(u);
//		System.out.println("Utente id : " + u.getId());
//		entityManager.getTransaction().commit();
	
		entityManager.close();

	}
	
}