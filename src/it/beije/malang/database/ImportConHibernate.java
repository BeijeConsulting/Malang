/* Le criteria servono per costruire le query Hql dinamiche al volo in Hibernate, sia in sql che Hql*/

package it.beije.malang.database;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.List;
import it.beije.malang.LetturaCSV;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import it.beije.malang.Contatto;


public class ImportConHibernate {
	
	public static void main(String argv[]) throws Exception {
		
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		System.out.println("is open?" + factory.isOpen());
		
		Session session = factory.openSession();
		
//		String hql = "SELECT c FROM Contatto as c";
//		Query<Contatto> query = session.createQuery(hql);
//		for (Contatto contatto : query.list()) {
//			System.out.println("id : " + contatto.getId());
//			System.out.println("nome : " + contatto.getNome());
//			System.out.println("cognome : " + contatto.getCognome());
//			System.out.println("telefono : " + contatto.getTelefono());
//			System.out.println("email : " + contatto.getEmail());
//		}
		List<String[]> fileLetto = new ArrayList<String[]>();
		fileLetto = LetturaCSV.taglia();
		//String[] leggi = new String[fileLetto.size()];
		//leggi = fileLetto.toArray(leggi);
		System.out.println("file letto: " + fileLetto);
		Criteria criteria = session.createCriteria(Contatto.class);
		List<Contatto> contatti = criteria.add(Restrictions.eq("nome", "pippo")).list();

		for (Contatto contatto : contatti) {
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
