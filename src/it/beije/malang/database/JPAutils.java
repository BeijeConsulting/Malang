package it.beije.malang.database;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.beije.malang.database.entities.Contatto;
import it.beije.malang.database.entities.Utente;
import it.beije.malang.database.entities.Indirizzo;

public class JPAutils {
	
	public static void main(String argv[]) throws IOException {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Malang");
		EntityManager entityManager = factory.createEntityManager();
		
		int id = 1;
		Contatto c = entityManager.find(Contatto.class, id);

		System.out.println("Contatto : " + c.getNome());

/*		Utente u = new Utente();
		u.setCognome("Ferulli");
		u.setNome("Marina2");
		u.setEmail("marina2@ferulli.it");
		
		entityManager.getTransaction().begin();

		System.out.println("Utente id : " + u.getNome());
		entityManager.persist(u);
		System.out.println("Utente id : " + u.getId());
		entityManager.getTransaction().commit();
	
		entityManager.close();
*/
		int id1 = 3;
		Utente u1 = entityManager.find(Utente.class, id1);
		
		Indirizzo i = new Indirizzo();
		i.setIdUtente(u1.getId());
		i.setProvincia("FC");
		i.setCitta("Bocconi");
		i.setCap("45354");
		i.setIndirizzo("Via Nazionale 5");
		entityManager.getTransaction().begin();

		System.out.println("Utente id : " + u1.getNome());
		entityManager.persist(i);
		System.out.println("Utente id : " + i.getId());
		entityManager.getTransaction().commit();
	
		entityManager.close();

	}
	
}