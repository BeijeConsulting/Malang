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
		
		int id = 2;
		
		Contatto c = entityManager.find(Contatto.class, id);

		System.out.println("Contatto : " + c.getNome());

		Contatto u = new Contatto();
		u.setCognome("evvai");
		u.setNome("prova");
		u.setEmail("funziona@molto.it");
		
		Contatto m = new Contatto();
		m.setCognome("prova");
		m.setNome("funziona");
		m.setEmail("funziona@la prova.it");
		
		Contatto n = new Contatto();
		n.setCognome("marco");
		n.setNome("cacciapuoti");
		n.setEmail("cacciapuoti@marco.it");
		
		entityManager.getTransaction().begin();

		System.out.println("Utente id : " + u.getId());
		entityManager.persist(u);
		entityManager.persist(m);
		entityManager.persist(n);
		System.out.println("Utente id : " + u.getId());
		entityManager.getTransaction().commit();
	
		entityManager.close();

	}
	
}