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
		
		int id = 1;
		Indirizzo c = entityManager.find(Indirizzo.class, id);
		Contatto c1 = entityManager.find(Contatto.class, id);

		System.out.println("Contatto : " + c.getCitta()+" ci abita "+c1.getCognome()+" "+c1.getNome());

		Utente u = new Utente();
		u.setCognome("Ferulli");
		u.setNome("Marina2");
		u.setEmail("marina2@ferulli.it");
		
		entityManager.getTransaction().begin();
/*
		System.out.println("Utente id : " + u.getId());
		entityManager.persist(u);
		System.out.println("Utente id : " + u.getId());
		*/
		entityManager.getTransaction().commit();
	
		entityManager.close();

	}
	
}