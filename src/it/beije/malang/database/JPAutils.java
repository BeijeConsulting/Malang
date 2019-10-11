package it.beije.malang.database;

import java.io.IOException;

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
		
		int id = 3;
		Utente u = entityManager.find(Utente.class, id);

		System.out.println("Utente : " + u.getNome());
		System.out.println("Indirizzi :" + u.getIndirizzi());
		
		for (Indirizzo indirizzi : u.getIndirizzi())
		{
			System.out.println("ID: " + indirizzi.getId());
			System.out.println("CITTA: " + indirizzi.getCitta());
			System.out.println("PROVINCIA: " + indirizzi.getProvincia());
			System.out.println("CAP: " + indirizzi.getCap());
			System.out.println("INDIRIZZO: " + indirizzi.getIndirizzo());
			System.out.println("TELEFONO: " + indirizzi.getTelefono());
		}

//		Utente u = new Utente();
//		u.setCognome("Ferulli");
//		u.setNome("Marina2");
//		u.setEmail("marina2@ferulli.it");
//		
		entityManager.getTransaction().begin();

		System.out.println("Utente id : " + u.getId());
		entityManager.persist(u);
		entityManager.getTransaction().commit();
		System.out.println("Utente id : " + u.getId());
	
		entityManager.close();

	}
	
}