package it.beije.malang.database;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.beije.malang.database.entities.Contatto;
import it.beije.malang.database.entities.Utente;


public class JPAutils {
	
	public static void main(String argv[]) throws IOException {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Malang");
		EntityManager entityManager = factory.createEntityManager();
		
		int id = 2;// stampo a video il nome dell ID che corrisponde
		Contatto c = entityManager.find(Contatto.class, id);

		System.out.println("Contatto : " + c.getNome());
         
		Utente u = new Utente();
		u.setCognome("Ferulli");
		u.setNome("Marina2");
		u.setEmail("marina2@ferulli.it");
		
		entityManager.getTransaction().begin();

		System.out.println("Utente id : " + u.getId());
		entityManager.persist(u);
		System.out.println("Utente id : " + u.getId());
		entityManager.getTransaction().commit();
	
		entityManager.close();

	}
	
}